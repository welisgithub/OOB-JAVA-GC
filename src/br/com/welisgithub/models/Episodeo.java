package br.com.welisgithub.models;

import br.com.welisgithub.calculos.Classificavel;

public class Episodeo implements Classificavel {
    private int numero;
    private int totalDeVisualisacoes;
    private Series series;
    private String nome;

    public int getTotalDeVisualisacoes() {
        return totalDeVisualisacoes;
    }

    public void setTotalDeVisualisacoes(int totalDeVisualisacoes) {
        this.totalDeVisualisacoes = totalDeVisualisacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualisacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
