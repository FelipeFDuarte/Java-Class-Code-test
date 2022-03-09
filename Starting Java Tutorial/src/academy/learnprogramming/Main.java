package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
         int score = 5000;
         int levelCompleted = 5;
         int bonus = 100;

//                if (score <=5000 && score>= 1000) {
//                System.out.println("Your score was less than 5000 but greater than 1000");
//                } else if (score < 1000){
//                System.out.println( "Your score was less than 1000");
//                }else {
//                System.out.println("Score higher than 5000");
//        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // Print out a second score on the screen with the following
        //score set to 10000
        // level completed set to 8
        //bonus set to 200
        // but make sure the first printout abouse still displays as well

        boolean gameOver2 = true;
        int score2 = 10000;
        int secLevelCompleted = 8;
        int bonus2 = 200;

//        if (gameOver2){
//            int secFinalScore = score2 + (secLevelCompleted * bonus2);
//            System.out.println("Your new score was " + secFinalScore);
//        }
        calculateScore();


        int Score3 = 4999;
        if (Score3 >= 5000){
            System.out.println("Your score was >=to 5000");
        }else if (Score3 < 1000 && Score3 >= 500){
            System.out.println("Yor score was < 1000 but >=500");
        }else if (Score3 <= 4999 && Score3 >= 1001){
            System.out.println("Your score was less than 4999 and more then 1001");
        } else {
            System.out.println("Your score was < 500");
        }
    }

    public static void calculateScore(){
        boolean gameOver2 = true;
        int score2 = 10000;
        int secLevelCompleted = 8;
        int bonus2 = 200;

        if (gameOver2){
            int secFinalScore = score2 + (secLevelCompleted * bonus2);
            System.out.println("Your new score was " + secFinalScore);
        }
    }



}
