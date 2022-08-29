package br.unifei.imc.jogador;

import br.unifei.imc.inimigo.Inimigo;

public class Player {

    private String nome;
    private double vida;

    public Player(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo ini){
        System.out.println("Player está descendo a porrada no inimigo!");

    }



}
