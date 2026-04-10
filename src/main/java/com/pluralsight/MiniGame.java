package com.pluralsight;

public class MiniGame {
    public static void main(String[] args) {

        boolean isActiveGamer = true;
        String game = "GTA";

        if (isActiveGamer && game == "GTA") {
            System.out.println("You're grinding in GTA again \uD83D\uDE0E Respect!");
        }
        else {
            System.out.println("Time to play some more games");
        }
    }
}
