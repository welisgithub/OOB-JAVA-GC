package br.com.welisgithub.calculos;

public class FiltroRecomenda {

    public void filtra (Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os melhores no momento!");
        } else if (classificavel.getClassificacao()>2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Guarde para assistir depois.");
        }
    }
}
