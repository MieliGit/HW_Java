package org.example.HW_O_3;

public interface Game {
    void start(Integer sizeW, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();


}
