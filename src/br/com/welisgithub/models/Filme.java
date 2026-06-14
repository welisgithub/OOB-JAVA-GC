package br.com.welisgithub.models;

import java.util.Locale;
import java.util.Scanner;

public class Filme extends Titles {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
