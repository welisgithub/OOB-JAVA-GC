import java.util.Locale;
import java.util.Scanner;

public class Filme {
    Scanner leitura = new Scanner(System.in);
    String nome;
    String genero;
    int anoDeLancamento;
    double somaMedia;
    int totalAvaliacoes;
    Boolean incluidoNoPlano;
    int duracaoEmMinutos;

    //********************************************************Métodos***************************************************

    void avalia(double nota){
        somaMedia += nota;
        totalAvaliacoes++;
    }

    void avaliaTeclado(){
        System.out.println("Qual nota você dá para o filme? ");
        double notaTeclado = leitura.nextDouble();
        somaMedia += notaTeclado;
        totalAvaliacoes++;
    }

    double mediaNota(){
        return somaMedia / totalAvaliacoes;
    }

    void exibeFicha(){
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
        System.out.println("Duração: " + duracaoEmMinutos + " minutos.");
    }
}
