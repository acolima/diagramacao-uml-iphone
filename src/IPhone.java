import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(){
        System.out.println("Ligando");
    };

    public void atender(){
        System.out.println("Atendendo");
    };

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    };

    public void exibirPagina(){
        System.out.println("Exibindo página no navegador");
    };

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no navegador");
    };

    public void atualizarPagina(){
        System.out.println("Atualizando página no navegador");
    };

    public void tocar(){
        System.out.println("Tocando música");
    };

    public void pausar(){
        System.out.println("Pausando música");
    };

    public void selecionarMusica(){
        System.out.println("Selecionando música");
    };
}
