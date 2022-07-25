package com.kodilla.rps;

import java.util.Scanner;

public class Instruction {

    public void instructionForTheGame(String name){
        System.out.println("Witaj " + name + "!");
        System.out.println("Instrukcja do gry:");
        System.out.println("1 - Kamień\n2 - Papier \n3 - Nożyce \nx - Zakończ grę \nn - Nowa gra");
        System.out.println();
    }
}
