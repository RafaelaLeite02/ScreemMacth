import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getDuracaoEmMinutos());
        System.out.println(meuFilme.obterMedia());

        Serie serie = new Serie();
        serie.setNome("TVD");
        serie.setAnoDeLancamento(2008);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpsodiosPorTemporada(10);
        serie.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar serie: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar ");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(serie);
        System.out.println(calc.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDaRafa = new Filme();
        filmeDaRafa.setNome("Dogville");
        filmeDaRafa.setDuracaoEmMinutos(200);
        filmeDaRafa.setAnoDeLancamento(2003);
        filmeDaRafa.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaRafa);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());








    }
}
