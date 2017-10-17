package br.org.merepresenta.importacao.i2017.daos.consultas.v1;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

class Decoder {
	private final String[] dados;
	public String[] getDados() {
		return dados;
	}
	public Decoder(final String[] linha) {
		this.dados = linha;
	}
	public Decoder(final String linha) {
		this.dados = linha.split("\\;");
	}
	
	public StringAs readField(int numero) {
		return new StringAs(dados[numero]);
	}
	
	public static class StringAs {
		private static final Pattern p = Pattern.compile("^\\\"\\#(NE|NULO)\\#\\\"");
		private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		private String o;

		public StringAs(String o ) {			
			try {
				this.o = p.matcher(o).matches() ? null : new String( o.substring(1, o.length()-1).getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		public String asString() {
			return o;
		}
		
		public Integer asInteger() {
			return Integer.valueOf(o);
		}
		
		public LocalDate asLocalDate() {
			return o == null? null : LocalDate.from(DATE_FORMAT.parse(o));
		}
		
		public LocalTime asLocalTime() {
			return o == null? null : LocalTime.from(TIME_FORMAT.parse(o));
		}
	}
}
