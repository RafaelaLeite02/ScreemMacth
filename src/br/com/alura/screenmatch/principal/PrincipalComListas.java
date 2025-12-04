package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

import static java.util.Collection.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDaRafa = new Filme("Dogville", 2003);
        filmeDaRafa.avalia(10);
        Serie serie = new Serie("TVD", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaRafa);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaArtista = new LinkedList<>();
        buscaArtista.add("Adam Sandeler");
        buscaArtista.add("Paulo");
        buscaArtista.add("Jaqueline");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação ");
        System.out.println(buscaArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenadas");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);




    }
}
