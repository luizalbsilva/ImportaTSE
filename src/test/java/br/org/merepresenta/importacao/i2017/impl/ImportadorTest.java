package br.org.merepresenta.importacao.i2017.impl;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.org.merepresenta.importacao.i2017.GenericDao;
import br.org.merepresenta.importacao.i2017.daos.consultas.vo.Candidato;
import br.org.merepresenta.importacao.i2017.daos.consultas.vo.Legenda;

public class ImportadorTest {
	private Importador importador = new Importador();
	private GenericDao genericDAO;
	
	@Before
	public void before() {
		genericDAO = Mockito.mock(GenericDao.class);
		this.importador.setGenericDAO(genericDAO);
	}
	
	@Test
	public void testImportaLegendas() {
		importador.importaLegendas("src/test/resources");
		verify(genericDAO, times(11)).save(any(Legenda.class));
	}

	@Test
	public void testImportaCandidatos() {
		importador.importaCandidatos("src/test/resources");
		verify(genericDAO, times(10)).save(any(Candidato.class));
	}

}
