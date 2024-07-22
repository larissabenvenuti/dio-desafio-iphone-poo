public class Iphone {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.reprodutorMusical();
        iphone.aparelhoTelefonico();
        iphone.navegadorInternet();
    }

    public void reprodutorMusical() {
        System.out.println("Reprodutor Musical:");
        tocar();
        pausar();
        selecionarMusica();
    }

    public void aparelhoTelefonico() {
        System.out.println("Aparelho Telefônico:");
        ligar();
        atender();
        iniciarCorreioDeVoz();
    }

    public void navegadorInternet() {
        System.out.println("Navegador na Internet:");
        exibirPagina();
        adicionarNovaAba();
        atualizarPagina();
    }

    private void tocar() {
        System.out.println(" - Tocar música");
    }

    private void pausar() {
        System.out.println(" - Pausar música");
    }

    private void selecionarMusica() {
        System.out.println(" - Selecionar música");
    }

    private void ligar() {
        System.out.println(" - Fazer uma ligação");
    }

    private void atender() {
        System.out.println(" - Atender uma ligação");
    }

    private void iniciarCorreioDeVoz() {
        System.out.println(" - Iniciar correio de voz");
    }

    private void exibirPagina() {
        System.out.println(" - Exibir página da web");
    }

    private void adicionarNovaAba() {
        System.out.println(" - Adicionar nova aba");
    }

    private void atualizarPagina() {
        System.out.println(" - Atualizar página da web");
    }
}