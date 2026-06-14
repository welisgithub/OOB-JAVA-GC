import br.com.welisgithub.models.Filme;
import br.com.welisgithub.models.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme panicoDois = new Filme();
        panicoDois.setNome("Pânico 2");
        panicoDois.setAnoDeLancamento(1997);
        panicoDois.setGenero("Terror");
        panicoDois.setDuracaoEmMinutos(120);

        Series theBoys = new Series();
        theBoys.setNome("The Boys");
        theBoys.setAnoDeLancamento(2024);
        theBoys.setGenero("Ficção");
        theBoys.getDuracaoEmMinutos();
        theBoys.exibeFicha();
        System.out.println("");
        System.out.println("");
        System.out.println("");

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
