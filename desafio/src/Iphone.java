public class Iphone implements Celular, Navegador, Itunes {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Alô");
    }

    @Override
    public void iniciaCorreioVoz() {
        System.out.println("Iniciando Correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo página...");
    }

    @Override
    public void adcionarAba() {
        System.out.println("Adicionando Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
