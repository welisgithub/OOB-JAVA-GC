//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme panicoDois = new Filme();
        panicoDois.nome = "Pânico 2";
        panicoDois.anoDeLancamento = 1997;
        panicoDois.genero = "Terror";
        panicoDois.incluidoNoPlano = true;
        panicoDois.notaMedia = 6.4;
        panicoDois.duracaoEmMinutos = 120;
        panicoDois.numeroDeAvaliacoes = 100000;

        System.out.println(panicoDois.nome);
        System.out.println(panicoDois.anoDeLancamento);
        System.out.println(panicoDois.genero);
        System.out.println(panicoDois.incluidoNoPlano);
        System.out.println(panicoDois.notaMedia);
        System.out.println(panicoDois.duracaoEmMinutos);
        System.out.println(panicoDois.numeroDeAvaliacoes);
    }
}