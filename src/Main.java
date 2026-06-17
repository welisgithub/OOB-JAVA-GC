import br.com.welisgithub.calculos.CalculadoraDeTempo;
import br.com.welisgithub.calculos.FiltroRecomenda;
import br.com.welisgithub.models.Episodeo;
import br.com.welisgithub.models.Filme;
import br.com.welisgithub.models.Series;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme panicoDois = new Filme();
        panicoDois.setNome("Pânico 2");
        panicoDois.setAnoDeLancamento(1997);
        panicoDois.setGenero("Terror");
        panicoDois.setDuracaoEmMinutos(120);

        Filme panicoTres = new Filme();
        panicoTres.setNome("Pânico 3");
        panicoTres.setAnoDeLancamento(2001);
        panicoTres.setGenero("Terror");
        panicoTres.setDuracaoEmMinutos(140);


        Series theBoys = new Series();
        Episodeo episodeo = new Episodeo();
        episodeo.setNumero(1);
        episodeo.setSeries(theBoys);
        episodeo.setTotalDeVisualisacoes(250);
        FiltroRecomenda filtro = new FiltroRecomenda();
        filtro.filtra(episodeo);
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2024);
        theBoys.setGenero("Ficção");
        theBoys.setTemporadas(4);
        theBoys.setEpisodeos(12);
        theBoys.setMinutosPorEpisodio(44);
//        theBoys.getDuracaoEmMinutos();
        calculadora.inclui(theBoys);
        theBoys.exibeFicha();
        System.out.println("");
//        System.out.println("");
//        System.out.println("");

        /* ********************************************************************************************************** */

        calculadora.inclui(panicoDois);
        panicoDois.avalia(8);
        panicoDois.avalia(9.5);
        panicoDois.avalia(5.6);
        panicoDois.avalia(7);
        panicoDois.exibeFicha();
//        panicoDois.avaliaTeclado();
//        panicoDois.avaliaTeclado();
//        panicoDois.avaliaTeclado();
//        panicoDois.avaliaTeclado();

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(panicoDois);
        listaDeFilmes.add(panicoTres);
        System.out.println("Numero de filems na lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);


    }
}
