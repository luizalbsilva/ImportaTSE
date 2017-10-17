package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaLegenda.Legenda;


public class LegendaTest {
	public final static String LINHA = "\"11/09/2017\";\"20:14:41\";\"2016\";\"1\";\"ELEIÇÕES MUNICIPAIS 2016\";\"AC\";\"01074\";\"CRUZEIRO DO SUL\";\"13\";\"VEREADOR\";\"COLIGACAO\";\"11\";\"PP\";\"PARTIDO PROGRESSISTA\";\"#NE#\";\"JUNTOS POR CRUZEIRO III\";\"PP / PR / PSC / PEN / SD / PSD\";\"10000000041\"";

	private Legenda legenda = new Legenda(LINHA, 1);

	@Test
	public void getLinha() {
		assertEquals(LINHA, legenda.getLinha());
	}

	@Test
	public void getNumeroLinha() {
		assertEquals(1, legenda.getNumeroLinha());
	}
		
	@Test
	public void getDataGeracao() {
		assertEquals(LocalDate.of(2017, 9, 11), legenda.getDataGeracao());
	}

	@Test
	public void getHoraGeracao() {
		assertEquals(LocalTime.of(20, 14, 41), legenda.getHoraGeracao());
	}

	@Test
	public void getAnoEleicao() {
		assertEquals(Integer.valueOf(2016), legenda.getAnoEleicao());
	}

	@Test
	public void getNumTurno() {
		assertEquals(Integer.valueOf(1), legenda.getNumTurno());
	}

	@Test
	public void getDescricaoEleicao() {
		assertEquals("ELEIÇÕES MUNICIPAIS 2016", legenda.getDescricaoEleicao());
	}

	@Test
	public void getSiglaUf() {
		assertEquals("AC", legenda.getSiglaUf());
	}

	@Test
	public void getSiglaUe() {
		assertEquals("01074", legenda.getSiglaUe());
	}

	@Test
	public void getNomeUe() {
		assertEquals("CRUZEIRO DO SUL", legenda.getNomeUe());
	}

	@Test
	public void getCodigoCargo() {
		assertEquals("13", legenda.getCodigoCargo());
	}

	@Test
	public void getDescricaoCargo() {
		assertEquals("VEREADOR", legenda.getDescricaoCargo());
	}

	@Test
	public void getTipoLegenda() {
		assertEquals("COLIGACAO", legenda.getTipoLegenda());
	}

	@Test
	public void getNumPartido() {
		assertEquals("11", legenda.getNumPartido());
	}

	@Test
	public void getSiglaPartido() {
		assertEquals("PP", legenda.getSiglaPartido());
	}

	@Test
	public void getNomePartido() {
		assertEquals("PARTIDO PROGRESSISTA", legenda.getNomePartido());
	}

	@Test
	public void getSiglaColigacao() {
		assertEquals(null, legenda.getSiglaColigacao());
	}

	@Test
	public void getNomeColigacao() {
		assertEquals("JUNTOS POR CRUZEIRO III", legenda.getNomeColigacao());
	}

	@Test
	public void getComposicaoColigacao() {
		assertEquals("PP / PR / PSC / PEN / SD / PSD", legenda.getComposicaoColigacao());
	}

	@Test
	public void getSequencialColigacao() {
		assertEquals("10000000041", legenda.getSequencialColigacao());
	}
}
