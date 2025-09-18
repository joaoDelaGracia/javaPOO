import br.com.joao.movies.modelos.Filme;
import br.com.joao.movies.modelos.Serie;

public class Main {

    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Duna 2");
        filme.setAno(2024);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(208);
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.exibeFichaTecnica();

        filme.avalia(9.30);
        filme.avalia(8.30);
        filme.avalia(7.30);

        System.out.println(filme.pegaMedia());

        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAno(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + serie.getDuracaoEmMinutos());

    }

}
