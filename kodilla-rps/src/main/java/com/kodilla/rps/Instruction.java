package com.kodilla.rps;

import java.util.Scanner;

public class Instruction {

    public String instructionForTheGame(String name){
        return "Witaj " + name + "!\n"
                + "1 - Kamień\n2 - Papier \n3 - Nożyce \nx - Zakończ grę \nn - Nowa gra";

    }
}
