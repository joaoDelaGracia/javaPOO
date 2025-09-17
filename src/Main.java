public class Main {

    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.nome = "Duna 2";
        filme.ano = 2024;
        filme.incluidoNoPlano = true;
        filme.duracaoEmMinutos = 208;

        filme.exibeFichaTecnica();

        filme.avalia(9.30);
        filme.avalia(8.30);
        filme.avalia(7.30);

        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.pegaMedia());


    }

}
