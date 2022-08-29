package br.unifei.imc.inimigo;

public abstract class Inimigo {
    protected String nome;
    protected double vida;
    protected String arma;

    public Inimigo(String nome, double vida, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void atacar();

    public abstract void tomarDano();

    public void mostraInfo(){
        System.out.println("Nome:"+this.nome + "vida:" + this.vida + "arma: " + this.arma);
    };
}
