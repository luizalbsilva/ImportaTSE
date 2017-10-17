package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalTime;

import br.org.merepresenta.importacao.i2017.daos.consultas.Consulta;

public class ConsultaCandidato implements Consulta<ConsultaCandidato.Candidato>, Closeable {
	private LineNumberReader reader;

	public ConsultaCandidato(File arquivo) throws IOException {
		//reader = new LineNumberReader(new FileReader(arquivo));
		this.reader = new LineNumberReader(Files.newBufferedReader(arquivo.toPath(), Charset.forName("ISO-8859-1")));
	}


	public Candidato next() throws IOException {
		String linha = reader.readLine();
		if (linha == null)
			throw new EOFException();
		return linha==null ? null : new Candidato(linha, reader.getLineNumber());
	}

	public int lineNumber() {
		return reader.getLineNumber();
	}

	public void close() throws IOException {
		reader.close();
	}

	public static class Candidato {		
		private final String linha;
		public String getLinha() {
			return linha;
		}
		
		private final int numeroLinha;
		public int getNumeroLinha() {
			return numeroLinha;
		}
		
		private Decoder decoder;
		
		public Candidato(String linha, int numero) {
			
			this.linha = linha;
			this.numeroLinha = numero;
			
			this.decoder  = new Decoder(linha);
		}
		
		public LocalDate getDataGeracao() {
			return decoder.readField(0).asLocalDate();
		}
	
		public LocalTime getHoraGeracao() {
			return decoder.readField(1).asLocalTime();
		}
	
		public Integer getAnoEleicao() {
			return decoder.readField(2).asInteger();
		}
	
		public Integer getNumeroTurno() {
			return decoder.readField(3).asInteger();
		}
	
		public String getDescricaoEleicao() {
			return decoder.readField(4).asString();
		}
		
		public String getSiglaUF() {
			return decoder.readField(5).asString();
		}
	
		public String getSiglaUE() {
			return decoder.readField(6).asString();
		}
	
		public String getDescricaoUE() {
			return decoder.readField(7).asString();
		}
	
		public String getCodigoCargo() {
			return decoder.readField(8).asString();
		}
	
		public String getDescricaoCargo() {
			return decoder.readField(9).asString();
		}
	
		public String getNomeCandidato() {
			return decoder.readField(10).asString();
		}
		
		public String getSequencialCandidato() {
			return decoder.readField(11).asString();
		}
	
		public String getNumeroCandidato() {
			return decoder.readField(12).asString();
		}
	
		public String getCpfCandidato() {
			return decoder.readField(13).asString();
		}
	
		public String getNomeUrnaCandidato() {
			return decoder.readField(14).asString();
		}
	
		public String getCodigoSituacaoCandidatura() {
			return decoder.readField(15).asString();
		}
	
		public String getDesSituacaoCandidatura() {
			return decoder.readField(16).asString();
		}
	
		public String getNumeroPartido() {
			return decoder.readField(17).asString();
		}
	
		public String getSiglaPartido() {
			return decoder.readField(18).asString();
		}
	
		public String getNomePartido() {
			return decoder.readField(19).asString();
		}
	
		public String getCodigoLegenda() {
			return decoder.readField(20).asString();
		}
	
		public String getSiglaLegenda() {
			return decoder.readField(21).asString();
		}
	
		public String getComposicaoLegenda() {
			return decoder.readField(22).asString();
		}
	
		public String getNomeLegenda() {
			return decoder.readField(23).asString();
		}
	
		public String getCodigoOcupacao() {
			return decoder.readField(24).asString();
		}
	
		public String getDescricaoOcupacao() {
			return decoder.readField(25).asString();
		}
	
		public LocalDate getDataNascimento() {
			return decoder.readField(26).asLocalDate();
		}
	
		public String getNumTituloEleitoralCandidato() {
			return decoder.readField(27).asString();
		}
	
		public String getIdadeDataEleicao() {
			return decoder.readField(28).asString();
		}
	
		public String getCodigoSexo() {
			return decoder.readField(29).asString();
		}
	
		public String getDescricaoSexo() {
			return decoder.readField(30).asString();
		}
	
		public String getCodGrauInstrucao() {
			return decoder.readField(31).asString();
		}
	
		public String getDescricaoGrauInstrucao() {
			return decoder.readField(32).asString();
		}
	
		public String getCodigoEstadoCivil() {
			return decoder.readField(33).asString();
		}
	
		public String getDescricaoEstadoCivil() {
			return decoder.readField(34).asString();
		}
	
		public String getCodigoCorRaca() {
			return decoder.readField(35).asString();
		}
	
		public String getDescricaoCorRaca() {
			return decoder.readField(36).asString();
		}
	
		public String getCodigoNacionalidade() {
			return decoder.readField(37).asString();
		}
	
		public String getDescricaoNacionalidade() {
			return decoder.readField(38).asString();
		}
	
		public String getSiglaUfNascimento() {
			return decoder.readField(39).asString();
		}
	
		public Integer getCodigoMunicipioNascimento() {
			return decoder.readField(40).asInteger();
		}
	
		public String getNomeMunicipioNascimento() {
			return decoder.readField(41).asString();
		}
	
		public String getDespesaMaxCampanha() {
			return decoder.readField(42).asString();
		}
	
		public String getCodSitTotTurno() {
			return decoder.readField(43).asString();
		}
	
		public String getDescSitTotTurno() {
			return decoder.readField(44).asString();
		}
	
		public String getNmEmail() {
			return decoder.readField(45).asString();
		}
		
	}
}