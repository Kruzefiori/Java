package br.unifei.imc.jogo;

public class Ashen {
    private String nome;
    private int vida;
    private Espada espada;

    public Ashen(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }
}
