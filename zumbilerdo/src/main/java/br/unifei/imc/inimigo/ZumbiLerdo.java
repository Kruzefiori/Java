package br.unifei.imc.inimigo;

import br.unifei.imc.inimigo.Inimigo;

public class ZumbiLerdo extends Inimigo {

    public ZumbiLerdo(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    @Override
    public void atacar() {
        //super.atacar();
        System.out.println("Zumbi fraquinho te arranhando!");
    }

    @Override
    public void tomarDano() {
        this.vida -= 2;
    }
}
