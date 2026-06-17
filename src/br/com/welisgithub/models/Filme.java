package br.com.welisgithub.models;

import br.com.welisgithub.calculos.Classificavel;

import java.util.Locale;
import java.util.Scanner;

public class Filme extends Titles implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ").";
    }
}
