package br.com.joao.movies.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    protected String nome;
    @SerializedName("Year")
    protected int ano;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;

    public Titulo(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public Titulo(TituloOmdb tituloOmdb){
        this.nome = tituloOmdb.title();
        this.ano = Integer.parseInt(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.parseInt(tituloOmdb.runtime().substring(0,2));
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + ano);
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", duração em minutos=" + duracaoEmMinutos +
                '}';
    }
}
