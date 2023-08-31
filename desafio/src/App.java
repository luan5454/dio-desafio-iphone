public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.exibirPagina();
        iphone.adcionarAba();
        iphone.atualizarPagina();

        iphone.ligar();
        iphone.atender();
        iphone.iniciaCorreioVoz();

        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();
    }
}
