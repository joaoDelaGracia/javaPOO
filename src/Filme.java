public class Filme {

    public String nome;
    public int ano;
    public boolean incluidoNoPlano;
    public double somaDasAvaliacoes = 0;
    public int totalDeAvaliacoes = 0;
    public int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + ano);
    }
    
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
    
}
