package br.org.merepresenta.importacao.i2017.impl;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.merepresenta.importacao.i2017.GenericDao;
import br.org.merepresenta.importacao.i2017.daos.consultas.Consulta;
import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidato;
import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidatoVotos;
import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaLegenda;
import br.org.merepresenta.importacao.i2017.daos.consultas.vo.Candidato;
import br.org.merepresenta.importacao.i2017.daos.consultas.vo.CandidatoVotos;
import br.org.merepresenta.importacao.i2017.daos.consultas.vo.Legenda;

@Component
public class Importador implements br.org.merepresenta.importacao.i2017.Importador {
	@SuppressWarnings("rawtypes")
	@Autowired
	private GenericDao genericDAO; 
	@SuppressWarnings("rawtypes")
	public void setGenericDAO(GenericDao genericDAO) {
		this.genericDAO = genericDAO;
	}
	
	@Transactional(value=TxType.NOT_SUPPORTED)
	public void importaLegendas(String legendas) {
		importa(legendas, new Fabrica<ConsultaLegenda.Legenda, Legenda>() {

			@Override
			public Consulta<ConsultaLegenda.Legenda> instanciaConsultor(File arquivo) throws IOException {
				return new ConsultaLegenda(arquivo);
			}

			@Override
			public Legenda novaInstancia() {
				return new Legenda();
			}

			@SuppressWarnings("rawtypes")
			@Override
			public GenericDao daoInstance() {
				return genericDAO;
			}

			@Override
			public Pattern getPattern() {
				return PATTERN_LEGENDA;
			}
		});
	}
	
	@Transactional(value=TxType.NOT_SUPPORTED)
	public void importaCandidatos(String candidatos) {
		importa(candidatos, new Fabrica<ConsultaCandidato.Candidato, Candidato>() {

			@Override
			public Consulta<br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidato.Candidato> instanciaConsultor(
					File arquivo) throws IOException {
				return new ConsultaCandidato(arquivo);
			}

			@Override
			public Candidato novaInstancia() {
				return new Candidato();
			}

			@SuppressWarnings("rawtypes")
			@Override
			public GenericDao daoInstance() {
				return genericDAO;
			}

			@Override
			public Pattern getPattern() {
				return PATTERN_CANDIDATO;
			}
		});
	}

	@Transactional(value=TxType.NOT_SUPPORTED)
	public void importaCandidatoVotos(String candidatoVotos) {
		importa(candidatoVotos, new Fabrica<ConsultaCandidatoVotos.CandidatoVotos, CandidatoVotos>() {

			@Override
			public Consulta<br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidatoVotos.CandidatoVotos> instanciaConsultor(
					File arquivo) throws IOException {
				return new ConsultaCandidatoVotos(arquivo);
			}

			@Override
			public CandidatoVotos novaInstancia() {
				return new CandidatoVotos();
			}

			@SuppressWarnings("rawtypes")
			@Override
			public GenericDao daoInstance() {
				return genericDAO;
			}

			@Override
			public Pattern getPattern() {
				return PATTERN_CANDIDATO_VOTOS;
			}
		});
	}

	private static final Pattern PATTERN_CANDIDATO_VOTOS = Pattern.compile("votacao_candidato_munzona_\\d{4}_[A-Z]{2}.txt");
	private static final Pattern PATTERN_CANDIDATO = Pattern.compile("consulta_cand_\\d{4}_[A-Z]{2}.txt");
	private static final Pattern PATTERN_LEGENDA =  Pattern.compile("consulta_legendas_\\d{4}_[A-Z]{2}.txt");
	
	@SuppressWarnings("rawtypes")
	private void importa(String pasta, final Fabrica fabrica) {
		
		File dirFile = new File(pasta); 
		File[] files = dirFile.listFiles();
		Arrays.stream( files ).
			sorted((a,b)-> a.getName().compareTo(b.getName()) ).
			filter( f -> fabrica.getPattern().matcher(f.getName()).matches()  ).
			forEach( f -> {
				int count = 0;
				try {
					System.out.println("\n===============================================================\nProcesando arquivo: " + f);
					Consulta consulta = fabrica.instanciaConsultor(f);
					GenericDao dao = fabrica.daoInstance();
					System.out.print("       ");
					try {
						while(true) {
							System.out.printf("\b\b\b\b\b\b\b%07d", count);
							Object next = consulta.next();
							count++;
							Object destino = fabrica.novaInstancia();
							BeanUtils.copyProperties(destino, next);
					
							dao.save(destino);
						}
					} catch (EOFException e) {
						System.out.println("\nTotal: " + count);
					}
				} catch (IOException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}  );
	}
}

interface Fabrica<C,T> {
	Consulta<C> instanciaConsultor(File arquivo) throws IOException;
	T novaInstancia();
	@SuppressWarnings("rawtypes")
	GenericDao daoInstance();
	Pattern getPattern();
}