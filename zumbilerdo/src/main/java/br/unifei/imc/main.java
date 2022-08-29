package br.unifei.imc;

import br.unifei.imc.inimigo.Inimigo;
import br.unifei.imc.inimigo.ZumbiLerdo;
import br.unifei.imc.inimigo.CavaleiroNegro;
import br.unifei.imc.inimigo.CavaleiroDePrata;
public class main {
    public static void main(String[] args) {
        Inimigo z = new ZumbiLerdo("roberto" , 1 , "garrinha");
        Inimigo c = new CavaleiroNegro("Richarles" , 666 , "Porrete gigante!");
        Inimigo p = new CavaleiroDePrata("samuel" , 0 , "oculos");

        z.atacar();
        c.atacar();
        c.mostraInfo();
        p.mostraInfo();


    }
}
