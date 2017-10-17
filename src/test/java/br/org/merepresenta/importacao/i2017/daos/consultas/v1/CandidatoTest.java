package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import br.org.merepresenta.importacao.i2017.daos.consultas.v1.ConsultaCandidato.Candidato;

public class CandidatoTest {

	private static String LINHA = "\"11/09/2017\";\"20:14:20\";\"2016\";\"1\";\"Eleições Municipais 2016\";\"AC\";\"01392\";\"RIO BRANCO\";\"13\";\"VEREADOR\";\"ANDRE LUIZ GALO MANSOUR\";\"10000000925\";\"13555\";\"57340331204\";\"ANDRÉ MANSOUR\";\"2\";\"DEFERIDO\";\"13\";\"PT\";\"PARTIDO DOS TRABALHADORES\";\"10000000062\";\"#NULO#\";\"PT / PSB\";\"Frente Popular de Rio Branco II - FPA II\";\"291\";\"OCUPANTE DE CARGO EM COMISSÃO\";\"24/03/1977\";\"002849332402\";\"39\";\"2\";\"MASCULINO\";\"8\";\"SUPERIOR COMPLETO\";\"3\";\"CASADO(A)\";\"01\";\"BRANCA\";\"1\";\"BRASILEIRA NATA\";\"AC\";\"-3\";\"RIO BRANCO\";\"0\";\"5\";\"SUPLENTE\";\"ANDREMANSOUR@BOL.COM.BR\"";

	private Candidato candidato = new Candidato(LINHA, 1);

	@Test
	public void testGetDataGeracao() {
		assertEquals(LocalDate.of(2017, 9, 11), candidato.getDataGeracao());
	}

	@Test
	public void testGetHoraGeracao() {
		assertEquals(LocalTime.of(20,14,20), candidato.getHoraGeracao());
	}

	@Test
	public void testGetAnoEleicao() {
		assertEquals(Integer.valueOf(2016), candidato.getAnoEleicao());
	}

	@Test
	public void testGetNumeroTurno() {
		assertEquals(Integer.valueOf(1), candidato.getNumeroTurno());
	}

	@Test
	public void testGetDescricaoEleicao() {
		assertEquals("Eleições Municipais 2016", candidato.getDescricaoEleicao());
	}

	@Test
	public void testGetSiglaUF() {
		assertEquals("AC", candidato.getSiglaUF());
	}

	@Test
	public void testGetSiglaUE() {
		assertEquals("01392", candidato.getSiglaUE());
	}

	@Test
	public void testGetDescricaoUE() {
		assertEquals("RIO BRANCO", candidato.getDescricaoUE());
	}

	@Test
	public void testGetCodigoCargo() {
		assertEquals("13", candidato.getCodigoCargo());
	}


	@Test
	public void testGetDescricaoCargo() {
		assertEquals("VEREADOR", candidato.getDescricaoCargo());
	}

	@Test
	public void testGetNomeCandidato() {
		assertEquals("ANDRE LUIZ GALO MANSOUR", candidato.getNomeCandidato());
	}

	@Test
	public void testGetSequencialCandidato() {
		assertEquals("10000000925", candidato.getSequencialCandidato());
	}

	@Test
	public void testGetNumeroCandidato() {
		assertEquals("13555", candidato.getNumeroCandidato());
	}

	@Test
	public void testGetCpfCandidato() {
		assertEquals("57340331204", candidato.getCpfCandidato());
	}

	@Test
	public void testGetNomeUrnaCandidato() {
		assertEquals("ANDRÉ MANSOUR", candidato.getNomeUrnaCandidato());
	}

	@Test
	public void testGetCodigoSituacaoCandidatura() {
		assertEquals("2", candidato.getCodigoSituacaoCandidatura());
	}

	@Test
	public void testGetDesSituacaoCandidatura() {
		assertEquals("DEFERIDO", candidato.getDesSituacaoCandidatura());
	}

	@Test
	public void testGetNumeroPartido() {
		assertEquals("13", candidato.getNumeroPartido());
	}
	
	@Test
	public void testGetSiglaPartido() {
		assertEquals("PT", candidato.getSiglaPartido());
	}

	@Test
	public void testGetNomePartido() {
		assertEquals("PARTIDO DOS TRABALHADORES", candidato.getNomePartido());
	}

	@Test
	public void testGetCodigoLegenda() {
		assertEquals("10000000062", candidato.getCodigoLegenda());
	}

	@Test
	public void testGetSiglaLegenda() {
		assertNull(candidato.getSiglaLegenda());
	}

	@Test
	public void testGetComposicaoLegenda() {
		assertEquals("PT / PSB", candidato.getComposicaoLegenda());
	}
	
	@Test
	public void testGetNomeLegenda() {
		assertEquals("Frente Popular de Rio Branco II - FPA II", candidato.getNomeLegenda());
	}

	@Test
	public void testGetCodigoOcupacao() {
		assertEquals("291", candidato.getCodigoOcupacao());
	}

	@Test
	public void testGetDescricaoOcupacao() {
		assertEquals("OCUPANTE DE CARGO EM COMISSÃO", candidato.getDescricaoOcupacao());
	}

	@Test
	public void testGetDataNascimento() {
		assertEquals(LocalDate.of(1977, 3, 24), candidato.getDataNascimento());
	}

	@Test
	public void testGetNumTituloEleitoralCandidato() {
		assertEquals("002849332402", candidato.getNumTituloEleitoralCandidato());
	}

	@Test
	public void testGetIdadeDataEleicao() {
		assertEquals("39", candidato.getIdadeDataEleicao());
	}

	@Test
	public void testGetCodigoSexo() {
		assertEquals("2", candidato.getCodigoSexo());
	}

	@Test
	public void testGetDescricaoSexo() {
		assertEquals("MASCULINO", candidato.getDescricaoSexo());
	}

	@Test
	public void testGetCodGrauInstrucao() {
		assertEquals("8", candidato.getCodGrauInstrucao());
	}

	@Test
	public void testGetDescricaoGrauInstrucao() {
		assertEquals("SUPERIOR COMPLETO", candidato.getDescricaoGrauInstrucao());
	}

	@Test
	public void testGetCodigoEstadoCivil() {
		assertEquals("3", candidato.getCodigoEstadoCivil());
	}

	@Test
	public void testGetDescricaoEstadoCivil() {
		assertEquals("CASADO(A)", candidato.getDescricaoEstadoCivil());
	}

	@Test
	public void testGetCodigoCorRaca() {
		assertEquals("01", candidato.getCodigoCorRaca());
	}

	@Test
	public void testGetDescricaoCorRaca() {
		assertEquals("BRANCA", candidato.getDescricaoCorRaca());
	}

	@Test
	public void testGetCodigoNacionalidade() {
		assertEquals("1", candidato.getCodigoNacionalidade());
	}

	@Test
	public void estGetDescricaoNacionalidade() {
		assertEquals("BRASILEIRA NATA", candidato.getDescricaoNacionalidade());
	}

	@Test
	public void testGetSiglaUfNascimento() {
		assertEquals("AC", candidato.getSiglaUfNascimento());
	}

	@Test
	public void testGetCodigoMunicipioNascimento() {
		assertEquals(Integer.valueOf(-3), candidato.getCodigoMunicipioNascimento());
	}

	@Test
	public void testGetNomeMunicipioNascimento() {
		assertEquals("RIO BRANCO", candidato.getNomeMunicipioNascimento());
	}

	@Test
	public void testGetDespesaMaxCampanha() {
		assertEquals("0", candidato.getDespesaMaxCampanha());
	}

	@Test
	public void testGetCodSitTotTurno() {
		assertEquals("5", candidato.getCodSitTotTurno());
	}

	@Test
	public void testGetDescSitTotTurno() {
		assertEquals("SUPLENTE", candidato.getDescSitTotTurno());
	}

	@Test
	public void testGetNmEmail() {
		assertEquals("ANDREMANSOUR@BOL.COM.BR", candidato.getNmEmail());
	}
}
