import br.com.alura.screenmatch.modelos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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







    }
}
