public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Aparelho telefônico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nNavegador de Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\nReprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}