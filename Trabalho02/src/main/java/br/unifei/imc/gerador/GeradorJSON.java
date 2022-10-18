package br.unifei.imc.gerador;

import br.unifei.imc.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.opencsv.CSVWriter;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorJSON implements GeradorArquivo{
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {
        FileWriter arquivo;
        try {
            Gson gson = new Gson();

            arquivo = new FileWriter("pessoas.json");

            JsonWriter writer = new JsonWriter(arquivo);

            pessoas.forEach(pessoa -> {
                try {
                    
                    gson.toJson(pessoa, new FileWriter("pessoas.json"));

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
