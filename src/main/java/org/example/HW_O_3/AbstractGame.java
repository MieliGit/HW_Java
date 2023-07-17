package org.example.HW_O_3;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{

    Integer sizeW;
    Integer maxTry;
    int currentTry;
    String compW;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeW, Integer maxTry) {
        this.sizeW = sizeW;
        this.maxTry = maxTry;
        compW = generateWord();
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;

    }

    @Override
    public Answer inputValue(String value) {
        if(currentTry >= maxTry){
            gameStatus =GameStatus.FINISH;
            System.out.println("Вы проиграли, колличество попыток кончилось");
            return null;

        }
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == compW.charAt(i)){
                bull++;
                cow++;
            } else if (compW.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        if(sizeW.equals(bull)){
            gameStatus = GameStatus.FINISH;
            System.out.println("Вы выиграли!");
            return null;
        }
        return new Answer(bull, cow, currentTry);

    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeW; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += (charList.get(randomIndex));
            charList.remove(randomIndex);

        }

        return result;

    }
}
