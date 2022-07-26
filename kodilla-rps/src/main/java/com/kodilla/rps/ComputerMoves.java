package com.kodilla.rps;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComputerMoves {

    public List<String> movesToBeDrawn(){

        List<String> moves = new LinkedList<>();

        moves.add("1");
        moves.add("2");
        moves.add("3");

        return moves;
    }

    public String calculateComputerMove(String defaultMove) {

        Random random = new Random();
        List<String> moves = movesToBeDrawn();

        int computerMoveInt;
        String computerMove;

        if (defaultMove.equals("1")){
            moves.add("2");
        } else if (defaultMove.equals("2")){
            moves.add("3");
        } else if(defaultMove.equals("3")){
            moves.add("1");
        }

        computerMoveInt = random.nextInt(3);

        computerMove = String.valueOf(movesToBeDrawn().get(computerMoveInt));

        if (computerMove.equals("1")){
            System.out.println("Komputer wybrał kamień");
        } else if (computerMove.equals("2")){
            System.out.println("Komputer wybrał papier");
        } else if (computerMove.equals("3")){
            System.out.println("Komputer wybrał nożyce");
        }

        return computerMove;
    }

    public String getComputerMove(String userMove) {

        if (userMove.equals("1")){
            System.out.println("Wybrałeś kamień");
            return  calculateComputerMove(userMove);
        } else if (userMove.equals("2")){
            System.out.println("Wybrałeś papier");
            return  calculateComputerMove(userMove);
        } else if (userMove.equals("3")){
            System.out.println("Wybrałeś nożyce");
            return  calculateComputerMove(userMove);
        }

        RpsRunner.round -= 1;
        return "Błędny ruch!";
    }
}
