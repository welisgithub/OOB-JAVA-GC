package br.com.welisgithub.calculos;

import br.com.welisgithub.models.Titles;

public class CalculadoraDeTempo {
    private int tempoTotalEmMinutos;

    public int getTempoTotalEmMinutos() {
        return tempoTotalEmMinutos;
    }

    public void inclui(Titles titles) {
        this.tempoTotalEmMinutos = 0;
        this.tempoTotalEmMinutos += titles.getDuracaoEmMinutos();
        System.out.println("Duração total: " + tempoTotalEmMinutos + " minutos.");
    }
}
