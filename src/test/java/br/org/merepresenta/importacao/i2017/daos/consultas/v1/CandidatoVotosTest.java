package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidatoVotos.CandidatoVotos;

public class CandidatoVotosTest {

	private static String LINHA = "\"12/10/2017\";\"20:32:16\";\"2016\";\"1\";\"ELEIÇÕES MUNICIPAIS 2016\";\"AC\";\"01007\";\"01007\";\"BUJARI\";\"9\";\"11\";\"65\";\"10000001880\";\"ROMUALDO DE SOUZA ARAUJO\";\"ROMUALDO\";\"PREFEITO\";\"12\";\"APTO\";\"2\";\"DEFERIDO\";\"1\";\"ELEITO\";\"65\";\"PC do B\";\"Partido Comunista do Brasil\";\"10000000176\";\"UNIDOS POR BUJARI\";\"PC do B / PRB / PR / PHS / PEN / PTC\";\"1853\";\"N\"";

	private CandidatoVotos candidato = new CandidatoVotos(LINHA, 1);

	@Test
	public void testGetDataGeracao() {
		assertEquals(LocalDate.of(2017, 10, 12), candidato.getDataGeracao());
	}

	@Test
	public void testGetHoraGeracao() {
		assertEquals(LocalTime.of(20,32,16), candidato.getHoraGeracao());
	}

	@Test
	public void testGetAnoEleicao() {
		assertEquals(Integer.valueOf(2016), candidato.getAnoEleicao());
	}

	@Test
	public void testGetNumeroTurno() {
		assertEquals(Integer.valueOf(1), candidato.getNumTurno());
	}

	@Test
	public void testGetDescricaoEleicao() {
		assertEquals("ELEIÇÕES MUNICIPAIS 2016", candidato.getDescricaoEleicao());
	}

	@Test
	public void testGetSiglaUF() {
		assertEquals("AC", candidato.getSiglaUf());
	}

	@Test
	public void testGetSiglaUE() {
		assertEquals("01007", candidato.getSiglaUe());
	}

	@Test
	public void testGetCodigoMunicipio() {
		assertEquals("01007", candidato.getCodigoMunicipio());
	}

	@Test
	public void testGetNomeMunicipio() {
		assertEquals("BUJARI", candidato.getNomeMunicipio());
	}

	@Test
	public void testGetNumeroZona() {
		assertEquals(Integer.valueOf("9"), candidato.getNumeroZona());
	}

	@Test
	public void testGetCodigoCargo() {
		assertEquals("11", candidato.getCodigoCargo());
	}

	@Test
	public void testGetNumeroCand() {
		assertEquals("65", candidato.getNumeroCand());
	}

	@Test
	public void testGetSqCandidato() {
		assertEquals("10000001880", candidato.getSqCandidato());
	}

	@Test
	public void testGetNomeCandidato() {
		assertEquals("ROMUALDO DE SOUZA ARAUJO", candidato.getNomeCandidato());
	}

    @Test
	public void testGetNomeUrnaCandidato() {
		assertEquals("ROMUALDO", candidato.getNomeUrnaCandidato());
	}

	@Test
	public void testGetDescricaoCargo() {
		assertEquals("PREFEITO", candidato.getDescricaoCargo());
	}

	@Test
	public void testGetCodSitCandSuperior() {
		assertEquals("12", candidato.getCodSitCandSuperior());
	}

	@Test
	public void testGetDescSitCandSuperior() {
		assertEquals("APTO", candidato.getDescSitCandSuperior());
	}
	
	@Test
	public void testGetCodigoSitCandidato() {
		assertEquals("2", candidato.getCodigoSitCandidato());
	}
	
	@Test
	public void testGetDescSitCandidato() {
		assertEquals("DEFERIDO", candidato.getDescSitCandidato());
	}

	@Test
	public void testGetCodigoSitCandTot() {
		assertEquals("1", candidato.getCodigoSitCandTot());
	}

	@Test
	public void testGetDescSitCandTot() {
		assertEquals("ELEITO", candidato.getDescSitCandTot());
	}

	@Test
	public void testGetNumeroPartido() {
		assertEquals("65", candidato.getNumeroPartido());
	}
	
	@Test
	public void testGetNomePartido() {
		assertEquals("Partido Comunista do Brasil", candidato.getNomePartido());
	}
	
	@Test
	public void testGetSequencialLegenda() {
		assertEquals("10000000176", candidato.getSequencialLegenda());
	}
	
	@Test
	public void testGetNomeColigacao() {
		assertEquals("UNIDOS POR BUJARI", candidato.getNomeColigacao());
	}

	@Test
	public void testGetComposicaoLegenda() {
		assertEquals("PC do B / PRB / PR / PHS / PEN / PTC", candidato.getComposicaoLegenda());
	}

	@Test
	public void testGetTotalVotos() {
		assertEquals(Integer.valueOf("1853"), candidato.getTotalVotos());
	}

	@Test
	public void testGetTransito() {
		assertEquals("N", candidato.getTransito());
	}
}
