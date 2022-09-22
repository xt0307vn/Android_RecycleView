package com.example.recycleview2;

public class Game {
    private int imgSource;
    private String nameGame;

    public Game(int imgSource, String nameGame) {
        this.imgSource = imgSource;
        this.nameGame = nameGame;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }

    public String getNameGame() {
        return nameGame;
    }

    public void setNameGame(String nameGame) {
        this.nameGame = nameGame;
    }
}
