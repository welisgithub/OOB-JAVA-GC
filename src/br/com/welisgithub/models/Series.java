package br.com.welisgithub.models;

public class Series extends Titles {
    private int temporadas;
    private int episodeos;
    private int duracaoEmMinutosTotal;
    private int minutosPorEpisodio;

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodeos * minutosPorEpisodio;
    }
}

