package br.unifei.imc;

import br.unifei.imc.jogo.Ashen;
import br.unifei.imc.jogo.Espada;

public class Principal {
    public static void main(String[] args) {
        var a = new Ashen("capiroto" , 200 );
        var e = new Espada(100 , 200);
        a.setEspada(e);

        a = new Ashen("capirota" , 666);

    }

}
