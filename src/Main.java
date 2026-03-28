public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.selecionarMusica("Numb - Linkin Park");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("6299999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
