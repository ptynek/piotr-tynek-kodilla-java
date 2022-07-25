package com.kodilla.rps;

public class Result {

    int userResult;
    int computerResult;

    public void gameResult(String userMove, String computerMove){

        if (userMove.equals("1") & computerMove.equals("2")){
            computerResult += 1;
        } else if (userMove.equals("1") & computerMove.equals("1")){
            userResult += 1;
            computerResult += 1;
        } else if (userMove.equals("1") & computerMove.equals("3")) {
            userResult += 1;
        } else if(userMove.equals("2") & computerMove.equals("1")){
            userResult +=1 ;
        } else if(userMove.equals("2") & computerMove.equals("2")){
            userResult += 1;
            computerResult += 1;
        } else if(userMove.equals("2") & computerMove.equals("3")){
            computerResult += 1;
        } else if(userMove.equals("3") & computerMove.equals("1")){
            computerResult += 1;
        } else if(userMove.equals("3") & computerMove.equals("2")){
            userResult += 1;
        } else if(userMove.equals("3") & computerMove.equals("3")){
            userResult += 1;
            computerResult += 1;
        }
    }

    public void restartGame(){
        userResult = 0;
        computerResult = 0;
    }

    public String announcement(int cResult, int uResult){

        if (cResult > uResult){
            return "Komputer wygrał!";
        } else if(uResult > cResult){
            return "Wygrałeś!";
        }
        return "Remis!";
    }
}
