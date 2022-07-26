package com.kodilla.rps;

public class Result {

    int userResult;
    int computerResult;


    public int getUserResult() {
        return userResult;
    }

    public int getComputerResult() {
        return computerResult;
    }

    public void setUserResult(int userResult) {
        this.userResult = userResult;
    }

    public void setComputerResult(int computerResult) {
        this.computerResult = computerResult;
    }

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
        setComputerResult(0);
        setUserResult(0);
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
