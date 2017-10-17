package br.org.merepresenta.importacao.i2017;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	private Importador importador;
	private Main main = new Main();
	
	@Before
	public void before() {
		importador = mock(Importador.class);
		main.setImportador(importador);
	}

	@Test
	public void legenda_file_passed() throws Exception {
		main.run(new String[]{"--legendas=src/test"});
		verify(importador, times(1)).importaLegendas(eq("src/test"));
		verify(importador, times(0)).importaCandidatos(anyString());
		verify(importador, times(0)).importaCandidatoVotos(anyString());
	}

	@Test
	public void candidato_file_passed() throws Exception {
		main.run(new String[]{"--candidatos=src/test"});
		verify(importador, times(0)).importaLegendas(anyString());
		verify(importador, times(1)).importaCandidatos(eq("src/test"));
		verify(importador, times(0)).importaCandidatoVotos(anyString());
	}


	@Test
	public void candidato_votos_file_passed() throws Exception {
		main.run(new String[]{"--candidatoVotos=src/test"});
		verify(importador, times(0)).importaLegendas(anyString());
		verify(importador, times(0)).importaCandidatos(anyString());
		verify(importador, times(1)).importaCandidatoVotos(eq("src/test"));
	}

	@Test
	public void legenda_and_candidatos_files_passed() throws Exception {
		main.run(new String[]{"--legendas=src/testl", "--candidatos=src/testc"});
		verify(importador, times(1)).importaLegendas(eq("src/testl"));
		verify(importador, times(1)).importaCandidatos(eq("src/testc"));
		verify(importador, times(0)).importaCandidatoVotos(anyString());
	}

	@Test
	public void legenda_and_candidatoVotoss_files_passed() throws Exception {
		main.run(new String[]{"--legendas=src/testl", "--candidatoVotos=src/testc"});
		verify(importador, times(1)).importaLegendas(eq("src/testl"));
		verify(importador, times(0)).importaCandidatos(anyString());
		verify(importador, times(1)).importaCandidatoVotos(eq("src/testc"));
	}

	@Test
	public void candidatos_and_candidatoVotos_files_passed() throws Exception {
		main.run(new String[]{"--candidatos=src/testc", "--candidatoVotos=src/testcv"});
		verify(importador, times(0)).importaLegendas(anyString());
		verify(importador, times(1)).importaCandidatos(eq("src/testc"));
		verify(importador, times(1)).importaCandidatoVotos(eq("src/testcv"));
	}

	@Test
	public void legenda_and_candidatos_and_candidatoVotos_files_passed() throws Exception {
		main.run(new String[]{"--legendas=src/testl", "--candidatos=src/testc", "--candidatoVotos=src/testcv"});
		verify(importador, times(1)).importaLegendas(eq("src/testl"));
		verify(importador, times(1)).importaCandidatos(eq("src/testc"));
		verify(importador, times(1)).importaCandidatoVotos(eq("src/testcv"));
	}
}
