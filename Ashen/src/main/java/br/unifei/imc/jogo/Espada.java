package br.unifei.imc.jogo;

public class Espada {
    private double resistencia;
    private int poder;

    public Espada(double resistencia, int poder) {
        this.resistencia = resistencia;
        this.poder = poder;
    }
    public void mostraInfo(){
        System.out.println("Informações da espada:");
        System.out.println("Poder: " + poder);
        System.out.println("Resistência: " + resistencia);
    }
}
