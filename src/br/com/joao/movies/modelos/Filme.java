package br.com.joao.movies.modelos;

import br.com.joao.movies.interfaces.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int ano) {
        super(nome, ano);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) this.pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return  "Filme: " + this.nome + " (" + this.ano + ")";
    }
}
