package br.com.welisgithub.main;

import br.com.welisgithub.models.Filme;
import br.com.welisgithub.models.Series;
import br.com.welisgithub.models.Titles;

import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Filme panicoDois = new Filme("Pânico 2", 1997);
        Filme panicoTres = new Filme("Pânico 3", 2001);
        Series theBoys = new Series("The Boys", 2024);
        Filme avatar = new Filme("Avatar", 2023);

        ArrayList<Titles> lista = new ArrayList<>();
        lista.add(panicoDois);
        panicoDois.avalia(9);
        lista.add(panicoTres);
        panicoTres.avalia(8);
        lista.add(theBoys);
        theBoys.avalia(9);
        lista.add(avatar);
        avatar.avalia(9.1);
        Collections.sort(lista);



        for (Titles item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

    }



}
