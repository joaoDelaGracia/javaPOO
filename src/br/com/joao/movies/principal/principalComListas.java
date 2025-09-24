package br.com.joao.movies.principal;

import br.com.joao.movies.modelos.Filme;
import br.com.joao.movies.modelos.Serie;
import br.com.joao.movies.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class principalComListas {

    public static void main(String[] args) {

        Filme filme = new Filme("Duna 2", 2024);
        filme.avalia(9);
        Filme filme2 = new Filme("Titanic", 2000);
        filme2.avalia(6);
        Filme filme3 = new Filme("Piratas do Caribe", 2003);
        filme3.avalia(10);

        Serie serie = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie);


        for (Titulo item: lista) {
            System.out.println(item);

            if (item instanceof Filme filmeItem && filmeItem.getClassificacao() > 2) {

                System.out.println("Classificação: " + filmeItem.getClassificacao());

            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("The Rock");
        buscaPorArtista.add("Leonardo Di Caprio");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Após ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAno));

        System.out.println(lista);

    }
}
