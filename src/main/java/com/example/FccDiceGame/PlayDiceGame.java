package com.example.FccDiceGame;

public class PlayDiceGame {

    public PlayDiceGame(){}
    Integer score = 0;
    int min = 6;
    int noOfRemainingDice = 5;
    int j = 0;
    boolean anyThree =false;
    public Integer play1() {
        return 4;}
    public Integer play() {
        while(noOfRemainingDice>0){
            for(int i=0;i<noOfRemainingDice; i++){
                int randomNo = (int)(Math.random()*6+1);
                if(randomNo==3){
                    //aD1=false;
                    score+=0;
                    j++;
                    anyThree = true;
                    min = 0;
                }
                else if(!anyThree){
                    min= min>randomNo? randomNo:min;
                    //j++;
                }
            }
            if(!anyThree) j++;
            score+= min;
            noOfRemainingDice-=j;
            j=0;
            min = 6;
            anyThree = false;

        }
        return score;
    }
}
