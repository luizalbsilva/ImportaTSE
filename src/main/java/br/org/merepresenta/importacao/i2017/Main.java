package br.org.merepresenta.importacao.i2017;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
		
		Main main = new Main();
		main.setImportador((Importador) context.getBean("importador", Importador.class));
		
		main.run(args);
	}
	
	private Importador importador;
	public void setImportador(Importador importador) {
		this.importador = importador;
	}
	
	public void run(String... args) throws Exception {
		String legenda = null, candidatos = null, candidatoVotos = null;
		
		for (int x=0; x<args.length; x++) {
			String arg = args[x];
			if (arg.startsWith("--legendas="))
				legenda = arg.substring(11);
			else if (arg.startsWith("--candidatos="))
				candidatos = arg.substring(13);
			else if (arg.startsWith("--candidatoVotos="))
				candidatoVotos = arg.substring(17);
		}
		
		if (legenda != null) importador.importaLegendas(legenda);
		if (candidatos != null) importador.importaCandidatos(candidatos);
		if (candidatoVotos != null) importador.importaCandidatoVotos(candidatoVotos);
	}
}