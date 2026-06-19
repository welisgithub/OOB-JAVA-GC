package br.com.welisgithub.models;

import br.com.welisgithub.exception.ErrorAgeException;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class Titles implements Comparable<Titles>{
    Scanner leitura = new Scanner(System.in);
    private String nome;
    private String genero;
    private int anoDeLancamento;
    private double somaMedia;
    private int totalAvaliacoes;
    private Boolean incluidoNoPlano = true;
    private int duracaoEmMinutos;

    public Titles(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titles(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErrorAgeException("Não consegui converter o ano" +
                    " porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
    }


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

    @Override
    public int compareTo(@NotNull Titles otherTitle) {
        return this.getNome().compareTo(otherTitle.getNome());
    }

    @Override
    public String toString() {
        return "Titles{" +
                "Nome ='" + nome + '\'' +
                ", Ano = " + anoDeLancamento +
                ", Duração = " + duracaoEmMinutos +
                '}';
    }
}
