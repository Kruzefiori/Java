package br.unifei.imc.service;

import br.unifei.imc.exceptions.OpcaoErradaException;
import br.unifei.imc.gerador.GeradorCSV;
import br.unifei.imc.gerador.GeradorJSON;
import br.unifei.imc.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    public List<Pessoa> gerarMapaPessoas(){
        //Cria a lista de pessoas
        List<Pessoa> p = new ArrayList<>();
        p.add(new Pessoa(1, "Guts", 39));
        p.add(new Pessoa(2, "Casca", 30));
        p.add(new Pessoa(3, "Andreas", 60));

        return p;
    }
    public void gerarArquivo(OpcaoArquivo op) {
        //Cria a lista usando a função gerarMapa
        List<Pessoa> pessoas = this.gerarMapaPessoas();
        if (op == OpcaoArquivo.CSV) {
            //Se a opção for CSV, cria um gerador CSV
            GeradorCSV gen = new GeradorCSV();
            gen.gerarArquivo(pessoas);
            }
        if(op == OpcaoArquivo.JSON){
            //Se a opção for Json, cria um gerador Json
            GeradorJSON gen = new GeradorJSON();
            gen.gerarArquivo(pessoas);
            }
        else {
            //throw new RuntimeException(OpcaoErradaException);
            }
        }

}
