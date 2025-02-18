package net.nosma;

import net.nosma.helpers.GameHelper;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        ArrayList<int[]> guesses = new ArrayList<>();
        guesses.add(locations);
        theDotCom.setLocationCells(guesses);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }

    }
}
