package br.com.othavio.screenmatch.principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.othavio.screenmatch.model.DadosSerie;
import br.com.othavio.screenmatch.service.ConsumoApi;
import br.com.othavio.screenmatch.service.ConverteDados;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private  final String API_KEY = "&apikey=de092c47";

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.println("Digite o nome da série para continuar: ");
        var nomeSerie = leitura.nextLine();
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
    
}
