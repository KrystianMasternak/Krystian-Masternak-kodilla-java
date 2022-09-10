package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args){

        boolean end = false;
        int runda = 0;
        int wynikPlayer = 0;
        int wynikComputer = 0;
        Game game = new Game();
        game.menu();
        System.out.println("Please enter your name");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Gamer gamer1 = new Gamer(nick);
        Gamer gamer2 = new Gamer("Computer");

        while(!end){

            System.out.println("How many wins do you want to play?");
            int qtyRounds = game.scanInt();

            for (int i=0; i<qtyRounds;) {
                runda++;
                System.out.println("Round " + runda);
                System.out.println("Playing " + gamer1.getName());
                System.out.println("Choose a rock, paper or scissors");
                int chosePlay1 = game.scanInt();
                Thing reusult = game.choosingToPlay(chosePlay1);
                System.out.println(reusult);

                System.out.println("Playing " + gamer2.getName());
                Computer computer = new Computer(gamer2);
                int chosePlay2 = computer.randomChose();
                Thing result2 = game.choosingToPlay(chosePlay2);
                System.out.println(result2);

                int k = game.gameResult(chosePlay1,chosePlay2);
                if (k > 0){
                    if (k == 1){
                        wynikPlayer++;
                        i=wynikPlayer;
                    }else {
                        wynikComputer++;
                        i= wynikComputer;
                    }
                }
                System.out.println("The current game score: " + wynikPlayer + " to " + wynikComputer);

                }
            game.endGameResult(wynikPlayer, wynikComputer);
            runda = 0;
            wynikPlayer = 0;
            wynikComputer = 0;
            System.out.println("New game - n");
            System.out.println("End game - x");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            if (choice.equals("x")){
                System.out.println("Are you sure?[y/n]");
                Scanner endCh = new Scanner(System.in);
                String endChoice = endCh.nextLine();
                if (endChoice.equals("y")){
                    System.out.println("End game");
                    end = true;
                }else if (endChoice.equals("n")){
                    System.out.println("New geme");
                }
            } else if (choice.equals("n")) {
                System.out.println("Are you sure you want to finish the current game?[y/n]");
                Scanner newGameCh = new Scanner(System.in);
                String newGameChoice = newGameCh.nextLine();
                if (newGameChoice.equals("y")){
                    System.out.println("New game");
                } else if (newGameChoice.equals("n")) {
                    System.out.println("End Game");
                    end = true;
                }
            }


        }
        }





    }
