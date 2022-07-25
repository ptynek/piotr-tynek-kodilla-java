package com.kodilla.rps;

public class CheckRounds {

    public boolean checkRound(int roundNumber, int rounds){
        if (roundNumber < rounds){
            return true;
        }
        return false;
    }
}
