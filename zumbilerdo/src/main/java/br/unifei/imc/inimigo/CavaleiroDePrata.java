package br.unifei.imc.inimigo;

public class CavaleiroDePrata extends Inimigo{

    public CavaleiroDePrata(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro de prata está atacando!");
    }

    @Override
    public void tomarDano() {
        this.vida -= 20;
    }
}
