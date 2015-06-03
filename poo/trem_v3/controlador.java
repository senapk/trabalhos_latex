package controle;
import passageiros.Animal;
import passageiros.Fresca;
import passageiros.GreenPeace;
import passageiros.Pessoa;
import trem.Locomotiva;
import trem.Trem;
import vagoes.VagaoCarga;
import vagoes.VagaoPessoas;
import vagoes.VagaoLuxo;

public class Controlador {
    public static void main(String[] args) {        
        Locomotiva locomotiva = new Locomotiva(10);
        Trem trem = new Trem(locomotiva);
        
        trem.addVagao(new VagaoCarga(35));
        trem.addVagao(new VagaoPessoas(2));
        trem.addVagao(new VagaoCarga(70));
        trem.addVagao(new VagaoPessoas(2));
        trem.addVagao(new VagaoPessoas(2));
        trem.addVagao(new VagaoPessoas(2));
        trem.addVagao(new VagaoCarga(10));
        trem.addVagao(new VagaoLuxo());
        
        trem.embarcar(new GreenPeace("Gr1"));
        trem.embarcar(new GreenPeace("Gr2", 40));
        trem.embarcar(new Animal("Cao", 20));
        trem.embarcar(new Pessoa("Do"));
        trem.embarcar(new Fresca("F1", 4));
        trem.embarcar(new Fresca("F2", 2));
        trem.embarcar(new Fresca("F3", 2));
        
        System.out.println(trem);

    }
}


