package controle;
import passageiros.Animal;
import passageiros.Pessoa;
import trem.Locomotiva;
import trem.Trem;
import vagoes.VagaoAnimais;
import vagoes.VagaoPessoas;

public class Controlador {
    public static void main(String[] args) {
        Locomotiva locomotiva = new Locomotiva(10);

        Trem trem = new Trem(locomotiva);

        trem.addVagao(new VagaoPessoas(1));
        trem.addVagao(new VagaoAnimais(35));
        trem.addVagao(new VagaoPessoas(2));
        trem.addVagao(new VagaoAnimais(30));

        trem.embarcar(new Animal("cao", 20));
        trem.embarcar(new Animal("cao", 30));
        trem.embarcar(new Animal("gato", 10));
        trem.embarcar(new Animal("cobra", 10));

        trem.embarcar(new Pessoa("Do"));
        trem.embarcar(new Pessoa("Re"));
        trem.embarcar(new Pessoa("Mi"));
        trem.embarcar(new Pessoa("Fa"));

        System.out.println(trem);

    }
}
