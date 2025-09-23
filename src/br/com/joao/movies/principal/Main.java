package br.com.joao.movies.principal;

import br.com.joao.movies.calculos.CalculadoraDeTempo;
import br.com.joao.movies.calculos.FiltroRecomendacao;
import br.com.joao.movies.modelos.Episodio;
import br.com.joao.movies.modelos.Filme;
import br.com.joao.movies.modelos.Serie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Filme filme = new Filme("Duna 2",2024);

        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(208);

        Filme filme2 = new Filme("Titanic", 2000);

        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(176);


        filme.avalia(9.30);
        filme2.avalia(8.30);


        Serie serie = new Serie("Lost", 2000);

        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        Filme filme3 = new Filme("Piratas do Caribe",2003);
        filme3.setDuracaoEmMinutos(160);
        filme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Os dados que tem na lista são: " + listaDeFilmes.toString());

    }

}
