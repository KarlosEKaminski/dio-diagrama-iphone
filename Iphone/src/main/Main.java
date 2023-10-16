package main;

import model.Iphone;

public class Main {
    public static void main(String[] args) {
        
        var iphone = new Iphone();
        
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
