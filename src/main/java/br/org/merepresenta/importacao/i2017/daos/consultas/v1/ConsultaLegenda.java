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

public class ConsultaLegenda implements Consulta<ConsultaLegenda.Legenda>, Closeable {
	private LineNumberReader reader;
	public ConsultaLegenda(File arquivo) throws IOException {
		this.reader = new LineNumberReader(Files.newBufferedReader(arquivo.toPath(), Charset.forName("ISO-8859-1")));
	}
	
	public Legenda next() throws IOException {
		String linha = reader.readLine();
		if (linha == null)
			throw new EOFException();
		return new Legenda(linha, reader.getLineNumber());
	}

	public int lineNumber() {
		return reader.getLineNumber();
	}


	public void close() throws IOException {
		reader.close();
	}

	public static class Legenda {		
		private final String linha;
		public String getLinha() {
			return linha;
		}
		
		private final int numeroLinha;
		public int getNumeroLinha() {
			return numeroLinha;
		}
		
		private final Decoder decoder;

		public Legenda(final String linha, final int numeroLinha) {
			this.linha = linha;
			this.decoder = new Decoder(linha);
			this.numeroLinha = numeroLinha;
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

		public Integer getNumTurno() {
			return decoder.readField(3).asInteger();
		}

		public String getDescricaoEleicao() {
			return decoder.readField(4).asString();
		}

		public String getSiglaUf() {
			return decoder.readField(5).asString();
		}

		public String getSiglaUe() {
			return decoder.readField(6).asString();
		}

		public String getNomeUe() {
			return decoder.readField(7).asString();
		}

		public String getCodigoCargo() {
			return decoder.readField(8).asString();
		}

		public String getDescricaoCargo() {
			return decoder.readField(9).asString();
		}

		public String getTipoLegenda() {
			return decoder.readField(10).asString();
		}

		public String getNumPartido() {
			return decoder.readField(11).asString();
		}

		public String getSiglaPartido() {
			return decoder.readField(12).asString();
		}

		public String getNomePartido() {
			return decoder.readField(13).asString();
		}

		public String getSiglaColigacao() {
			return decoder.readField(14).asString();
		}

		public String getNomeColigacao() {
			return decoder.readField(15).asString();
		}

		public String getComposicaoColigacao() {
			return decoder.readField(16).asString();
		}

		public String getSequencialColigacao() {
			return decoder.readField(17).asString();
		}
	}
}