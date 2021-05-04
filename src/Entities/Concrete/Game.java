package Entities.Concrete;

import Entities.Entity;

public class Game implements Entity {
    private int gameId;
    private int gamePrice;
    private String gameName;

    public Game(int gameId, int gamePrice, String gameName) {
        this.gameId = gameId;
        this.gamePrice = gamePrice;
        this.gameName = gameName;
    }


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
