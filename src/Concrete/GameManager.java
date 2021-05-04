package Concrete;

import Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements GameService {

    @Override
    public void Add(Game game) {
        System.out.println("Oyun eklendi" + game.getGameName() + game.getGamePrice());
    }

    @Override
    public void Update(Game game) {
        System.out.println("Oyun Güncellendi" + game.getGameName() + game.getGamePrice());
    }

    @Override
    public void Delete(Game game) {
        System.out.println("Oyun Silindi" + game.getGameName() + game.getGamePrice());
    }


}
