package net.nosma.helpers;

import java.util.Scanner;

public class GameHelper {
    public static String getUserInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);

        return scanner.nextLine();
    }
}
