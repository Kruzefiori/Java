import helpers.CsvUtils;
import model.Game;
import model.Plataform;
import module.ServiceGame;

import java.nio.file.Paths;
import java.util.List;

public class  Principal {


    public static void main(String[] args) {
        List<Game> allGameList = CsvUtils.readGameCsv(Paths.get("vendas-games.csv"));
        List<Game> ps4Games =  ServiceGame.getListByPlatform(allGameList , Plataform.PS4);
        ps4Games.forEach(g -> System.out.println(g.getName()));
    }

    //List<Game> ps4Games = ServiceGame.getListByPlatform(allGameList , )
}
