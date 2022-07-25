package com.kodilla.rps;

public class CheckRounds {

    public boolean checkRound(int roundNumber){
        if (roundNumber < RpsRunner.rounds){
            return true;
        }
        return false;
    }
}
