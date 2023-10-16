package model;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public Iphone() {}

    public void ligar() {
        System.out.println("\nChamando número discado...");
    }

    public void atender() {
        System.out.println("\nAlo?");
    }

    public void iniciarCorreioVoz() {
        System.out.println("\nGrave sua mensagem após o sinal...");
    }

    public void exibirPagina() {
        System.out.println("\nExibindo página.");
    }

    public void adicionarNovaAba() {
        System.out.println("\nAbrindo nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("\nAtualizando a página.");
    }

    public void tocar() {
        System.out.println("\nReproduzindo música.");
    }

    public void pausar() {
        System.out.println("\nPausando música.");
    }

    public void selecionarMusica() {
        System.out.println("\nMúsica Selecionada\n");
    }    

}
