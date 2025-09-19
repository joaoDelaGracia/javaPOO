import br.com.joao.movies.calculos.CalculadoraDeTempo;
import br.com.joao.movies.calculos.FiltroRecomendacao;
import br.com.joao.movies.modelos.Episodio;
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

        Filme outroFilme = new Filme();

        outroFilme.setNome("Titanic");
        outroFilme.setAno(2000);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(176);
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());

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

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

    }

}
