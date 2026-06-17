package br.com.welisgithub.models;

import java.util.Locale;
import java.util.Scanner;

public class Titles {
    Scanner leitura = new Scanner(System.in);
    private String nome;
    private String genero;
    private int anoDeLancamento;
    private double somaMedia;
    private int totalAvaliacoes;
    private Boolean incluidoNoPlano = true;
    private int duracaoEmMinutos;

    //***********************************************get&set************************************************************

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public Scanner getLeitura() {
        return leitura;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //********************************************************Métodos***************************************************


    public void avalia(double nota){
        somaMedia += nota;
        totalAvaliacoes++;
    }

    public void avaliaTeclado(){
        System.out.println("Qual nota você dá para o filme? ");
        double notaTeclado = leitura.nextDouble();
        somaMedia += notaTeclado;
        totalAvaliacoes++;
    }

    public double mediaNota(){
        return somaMedia / totalAvaliacoes;
    }

    public void exibeFicha(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota média do filme: " + String.format(Locale.US, "%.1f", mediaNota()));
        System.out.println("Número de avaliações: " + totalAvaliacoes);
        if (incluidoNoPlano){
            System.out.println("Incluso no plano!");
        }else{
            System.out.println("Não incluso no plano...");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
