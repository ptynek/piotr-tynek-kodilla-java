package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    static int rounds = 0;
    static int round = 0;

    public static void main(String[] args) {

        Instruction instruction = new Instruction();
        ComputerMoves computerMoves = new ComputerMoves();
        CheckRounds checkRounds = new CheckRounds();
        EndOfTheGame endOfTheGame = new EndOfTheGame();

        Scanner scanner = new Scanner(System.in);
        Result result = new Result();

        boolean end = false;
        String name;
        String userMove;

        String computerMove;

        System.out.println("Podaj swoje imię: ");
        name = scanner.next();
        System.out.println("Podaj ile rund chcesz rozegrać: ");
        try {
            rounds = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.out.println(e);
        }
        result.restartGame();
        instruction.instructionForTheGame(name);
        while(!end){

            round += 1;

            System.out.println("Podaj swój ruch: ");
            userMove = scanner.next();
            computerMove = computerMoves.getComputerMove(userMove);
            result.gameResult(userMove, computerMove);

            System.out.println();
            System.out.println("Komputer " + result.computerResult + ":" + result.userResult + " Ty");
            System.out.println();

            System.out.println("Rounds " + rounds);
            System.out.println("Round " + round);
            if (!checkRounds.checkRound(round)) {
                System.out.println(result.announcement(result.computerResult, result.userResult));
                System.out.println("Czy chcesz kontynuuować grę? (x/n)");
                String doYouWantToContinue = scanner.next();
                if (endOfTheGame.endOfTheGameReaction(doYouWantToContinue)) {
                    System.exit(0);
                } else {
                    System.out.println("Podaj liczbę rund do rozegrania.");
                    rounds = Integer.parseInt(scanner.next());
                    round = 0;
                    result.restartGame();
                }
            }
        }
    }
}
