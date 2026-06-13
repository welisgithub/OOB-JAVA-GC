//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme panicoDois = new Filme();
        panicoDois.nome = "Pânico 3";
        panicoDois.anoDeLancamento = 1997;
        panicoDois.genero = "Terror";
        panicoDois.incluidoNoPlano = true;
        panicoDois.somaMedia = 0;
        panicoDois.duracaoEmMinutos = 120;
        panicoDois.totalAvaliacoes = 0;

        /* ********************************************************************************************************** */

        panicoDois.avalia(8);
        panicoDois.avalia(9.5);
        panicoDois.avalia(5.6);
        panicoDois.avalia(7);
        panicoDois.exibeFicha();
        panicoDois.avaliaTeclado();
        panicoDois.avaliaTeclado();
        panicoDois.avaliaTeclado();
        panicoDois.avaliaTeclado();
        panicoDois.exibeFicha();
    }
}
