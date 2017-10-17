package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class ConsultaCandidatoVotosTest {
	private ConsultaCandidato consultaCandidato;

	public ConsultaCandidatoVotosTest() throws IOException {
		consultaCandidato = new ConsultaCandidato(new File("src/test/resources/votacao_candidato_munzona_2016_AC.txt"));
	}
	
	@Test(expected=EOFException.class)
	public void test() throws Exception {
		while(true)
			consultaCandidato.next();
	}

}
