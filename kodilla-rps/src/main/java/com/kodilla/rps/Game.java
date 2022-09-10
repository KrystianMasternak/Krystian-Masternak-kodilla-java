package com.kodilla.rps;


import java.util.Scanner;

public class Game {

    public void menu(){
        System.out.println("Welcome to the game rock, paper, scissors");
        System.out.println("If you want to play a rock, choose 1");
        System.out.println("If you want to play paper, chose 2");
        System.out.println("If you want to play scissors, choose 3");
        System.out.println("If you want to start over, select n");
        System.out.println("If you want to end the game select x");
        System.out.println();
    }

    public int scanInt(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        return x;
    }

    public Thing choosingToPlay(int choseThing){
        Thing object;
        if (choseThing == 1){
            object = new Rock();
        } else if (choseThing == 2) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public int gameResult(int gamer1, int gamer2){
        if (gamer1 == gamer2){
            System.out.println("Remis");
            return 0;
        } else if (gamer1 == 1 && gamer2 == 3 || gamer1 == 2 && gamer2 == 1 || gamer1 == 3 && gamer2 == 2){
            System.out.println("Win!");
            return 1;
        } else {
            System.out.println("Lose!");
            return 2;
        }
    }
    public void endGameResult(int wyniki1, int wynik2){
        if (wyniki1>wynik2){
            System.out.println("Win the game!");
        }else {
            System.out.println("Lose the game");
        }
    }






}
