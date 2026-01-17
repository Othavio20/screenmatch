package br.com.othavio.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.othavio.screenmatch.model.DadosSerie;
import br.com.othavio.screenmatch.service.ConsumoApi;
import br.com.othavio.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		var ConsumoApi = new ConsumoApi();
		var json = ConsumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=de092c47");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
}

}
