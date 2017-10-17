package br.org.merepresenta.importacao.i2017.daos.consultas;

import java.io.IOException;

/** Realiza consultas */
public interface Consulta<T> {
	/** Próximo registro */
	T next() throws IOException;
	
	/** Número da linha */
	int lineNumber();
}
