package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class ConsultaLegendaTest {
	private ConsultaLegenda consultaLegenda;

	public ConsultaLegendaTest() throws IOException {
		consultaLegenda = new ConsultaLegenda(new File("src/test/resources/consulta_legendas_2016_AC.txt"));
	}
	
	@Test(expected=EOFException.class)
	public void test() throws Exception {
		while(true)
			consultaLegenda.next();
	}

}
