package com.kodilla.rps;

import java.util.Scanner;

public class EndOfTheGame {

    boolean endOfTheGameReaction(String key) {

        Scanner scanner = new Scanner(System.in);
        String doYouWantToEnd;
        String doYouWantToPlayNewGame ;
        if (key.equals("x") || key.equals("X")){

            System.out.println("Czy na pewno chcesz zakończyć grę ? (Y/N): ");
            doYouWantToEnd = scanner.next();
            if (doYouWantToEnd.equals("y") || doYouWantToEnd.equals("Y")) {
                return true;
            } else if (doYouWantToEnd.equals("N")|| doYouWantToEnd.equals("n")){
                System.out.println("Kontynuujmy!");
                return false;
            }

        } else if (key.equals("n") || key.equals("N")){

            System.out.println("Czy na pewno rozegrać nową grę? (Y/N)");
            doYouWantToPlayNewGame = scanner.next();
            if (doYouWantToPlayNewGame.equals("y") || doYouWantToPlayNewGame.equals("Y")) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
