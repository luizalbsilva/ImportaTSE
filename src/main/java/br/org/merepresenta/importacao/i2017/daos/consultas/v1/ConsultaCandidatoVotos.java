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

public class ConsultaCandidatoVotos implements Consulta<ConsultaCandidatoVotos.CandidatoVotos>, Closeable {
	private LineNumberReader reader;

	public ConsultaCandidatoVotos(File arquivo) throws IOException {
		this.reader = new LineNumberReader(Files.newBufferedReader(arquivo.toPath(), Charset.forName("ISO-8859-1")));
	}

	@Override
	public void close() throws IOException {
		reader.close();
	}

	@Override
	public CandidatoVotos next() throws IOException {
		String linha = reader.readLine();
		if (linha == null)
			throw new EOFException();
		return linha == null ? null : new CandidatoVotos(linha, reader.getLineNumber());
	}

	@Override
	public int lineNumber() {
		return reader.getLineNumber();
	}

	public static class CandidatoVotos {
		private final String linha;

		public String getLinha() {
			return linha;
		}

		private final int numeroLinha;

		public int getNumeroLinha() {
			return numeroLinha;
		}

		private Decoder decoder;

		public CandidatoVotos(String linha, int numero) {
			this.linha = linha;
			this.numeroLinha = numero;

			this.decoder = new Decoder(linha);
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

		public String getCodigoMunicipio() {
			return decoder.readField(7).asString();
		}

		public String getNomeMunicipio() {
			return decoder.readField(8).asString();
		}

		public Integer getNumeroZona() {
			return decoder.readField(9).asInteger();
		}

		public String getCodigoCargo() {
			return decoder.readField(10).asString();
		}

		public String getNumeroCand() {
			return decoder.readField(11).asString();
		}

		public String getSqCandidato() {
			return decoder.readField(12).asString();
		}

		public String getNomeCandidato() {
			return decoder.readField(13).asString();
		}

		public String getNomeUrnaCandidato() {
			return decoder.readField(14).asString();
		}

		public String getDescricaoCargo() {
			return decoder.readField(15).asString();
		}

		public String getCodSitCandSuperior() {
			return decoder.readField(16).asString();
		}

		public String getDescSitCandSuperior() {
			return decoder.readField(17).asString();
		}

		public String getCodigoSitCandidato() {
			return decoder.readField(18).asString();
		}

		public String getDescSitCandidato() {
			return decoder.readField(19).asString();
		}

		public String getCodigoSitCandTot() {
			return decoder.readField(20).asString();
		}

		public String getDescSitCandTot() {
			return decoder.readField(21).asString();
		}

		public String getNumeroPartido() {
			return decoder.readField(22).asString();
		}

		public String getSiglaPartido() {
			return decoder.readField(23).asString();
		}

		public String getNomePartido() {
			return decoder.readField(24).asString();
		}

		public String getSequencialLegenda() {
			return decoder.readField(25).asString();
		}

		public String getNomeColigacao() {
			return decoder.readField(26).asString();
		}

		public String getComposicaoLegenda() {
			return decoder.readField(27).asString();
		}

		public Integer getTotalVotos() {
			return decoder.readField(28).asInteger();
		}

		public String getTransito() {
			return decoder.readField(29).asString();
		}
	}
}
