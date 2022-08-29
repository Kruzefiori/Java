package br.unifei.imc.inimigo;

public class CavaleiroNegro extends Inimigo {

    public CavaleiroNegro(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    public void ataqueRapid(){
        System.out.println("Ataque rápido!");
    }

    @Override
    public void atacar() {
        //super.atacar();//chama o método da super e o que vier abaixo
        System.out.println("CAVALEIRO ATACANDO PESADO TE MATANDO NA PORRADA");
    }

    @Override
    public void tomarDano() {
        this.vida -= 20;
    }
}
