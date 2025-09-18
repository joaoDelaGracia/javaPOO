package br.com.joao.movies.calculos;

import br.com.joao.movies.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
