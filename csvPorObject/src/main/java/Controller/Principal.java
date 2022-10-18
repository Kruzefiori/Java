package Controller;

import helpers.CsvUtils;
import model.Game;
import model.Plataform;
import model.Publisher;
import module.ServiceGame;

import java.nio.file.Paths;
import java.util.List;

public class  Principal {


    public static void main(String[] args) {
        List<Game> allGameList = CsvUtils.readGameCsv(Paths.get("vendas-games.csv"));
        List<Game> ps4Games =  ServiceGame.getListByPlatform(allGameList , Plataform.PS4);
        System.out.println("Jogos de Playstation 4");
        ps4Games.forEach(g -> System.out.println(g.getName()));

        System.out.println("Jogos da publisher Nintendo");
        List<Game> nintendoGames = ServiceGame.getListByPublisher(allGameList, Publisher.Nintendo);
        nintendoGames.forEach(g -> System.out.println(g.getName()));
    }

    //List<Game> ps4Games = ServiceGame.getListByPlatform(allGameList , )
}
