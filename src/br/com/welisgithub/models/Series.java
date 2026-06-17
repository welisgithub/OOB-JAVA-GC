package br.com.welisgithub.models;

public class Series extends Titles {
    private int temporadas;
    private int episodeos;
    private int duracaoEmMinutosTotal;
    private int minutosPorEpisodio;

    public Series(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //******************************************************************************************************************

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //******************************************************************************************************************

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodeos * minutosPorEpisodio;
    }
}

