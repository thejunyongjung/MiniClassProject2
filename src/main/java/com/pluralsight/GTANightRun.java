package com.pluralsight;
import java.util.*;

public class GTANightRun {
    public static void main(String[] args) {

        // Scanner
        Scanner get = new Scanner(System.in);

        // Variables
        boolean playing = true;
        String choice;
        int health = 100;
        int money = 0;

        // Opening Lines
        System.out.println("Welcome to GTA Night Run!");
        System.out.println("You wake up in a dark valley");
        System.out.println("The city is dangerous. You mission is to survive the night and make money");
        System.out.println("If your heath becomes 0, Game over!");
        System.out.println("If you make more than $1,000, you win the game.");
        System.out.println();

        while (playing) {
            System.out.println("==============================");
            System.out.println("What do you do?");
            System.out.println("1. Steal car");
            System.out.println("2. Walk Away");
            System.out.println("3. Rob bank");
            System.out.println("4. Enter nightclub");
            System.out.print("Enter Choice: ");

            choice = get.nextLine();

            if (choice.equals("1")) {
                System.out.println();
                System.out.println("You found a parked Lamborghini!");
                System.out.println("A car alarm starts blaring...!");
                System.out.println("What do you do?");
                System.out.println("1.Run");
                System.out.println("2. Hide");
                System.out.print("Enter Choice: ");

                String carChoice = get.nextLine();
                if (carChoice.equals("1")) {
                    System.out.println();
                    System.out.println("You escaped the police, but got one gun shot.");
                    health -= 20;
                    money += 300;
                } else if (carChoice.equals("2")) {
                    System.out.println();
                    System.out.println("You hid behind the dumpster. The police left.");
                    System.out.println("But you lost car and gained nothing");
                } else {
                    System.out.println();
                    System.out.println("Invalid choice. You froze and got caught.");
                    health -= 100;
                }

            } else if (choice.equals("2")) {
                System.out.println();
                System.out.println("You saw a man walking behind you");
                System.out.println("He looks suspicious but seems like a rich man");
                System.out.println("What do you do?");
                System.out.println("1. Punch him and steal money");
                System.out.println("2. Keep walking");
                System.out.print("Enter Choice: ");

                String walkChoice = get.nextLine();
                if (walkChoice.equals("1")) {
                    System.out.println();
                    System.out.println("You punched him and stole money from him");
                    System.out.println("You got one star");
                    money += 500;
                } else if (walkChoice.equals("2")) {
                    System.out.println();
                    System.out.println("Bang, the gun shot happened. You got damaged.");
                    health -= 50;
                } else {
                    System.out.println();
                    System.out.println("Invalid choice. You hesitated and wasted time.");
                }
            } else if (choice.equals("3")) {
                System.out.println();
                System.out.println("You attempt a bank robbery!");
                System.out.println("The alarm triggers unexpectedly.");
                System.out.println("What do you do?");
                System.out.println("1. Escape");
                System.out.println("2. Fight");
                System.out.print("Enter Choice: ");

                String bankChoice = get.nextLine();
                if (bankChoice.equals("1")) {
                    System.out.println();
                    System.out.println("You escape through the back door with a bag of cash!");
                    money += 700;
                } else if (bankChoice.equals("2")) {
                    System.out.println();
                    System.out.println("Bad idea. Security fights back.");
                    health -= 40;
                } else {
                    System.out.println();
                    System.out.println("Invalid choice. You got surrounded.");
                    health -= 100;
                }
            } else if (choice.equals("4")) {
                System.out.println();
                System.out.println("You entered a nightclub full of loud music and shady people.");
                System.out.println("A man offers a secret mission");
                System.out.println("What do you do?");
                System.out.println("1. Accept");
                System.out.println("2. Reject");
                System.out.print("Enter Choice: ");

                String nightclubChoice = get.nextLine();
                if (nightclubChoice.equals("1")) {
                    System.out.println();
                    System.out.println("You delivered a secret mission successfully.");
                    money += 200;
                } else if (nightclubChoice.equals("2")) {
                    System.out.println();
                    System.out.println("You left the club safely, but someone bumps into you");
                    health -= 20;
                } else {
                    System.out.println();
                    System.out.println("Lucky! You found a bag of gold!");
                    money += 1000;
                }
            } else {
                System.out.println();
                System.out.println("Invalid choice. Try again.");
            }

            System.out.println();

            if (health <= 0) {
                System.out.println();
                System.out.println("Wasted!");
                System.out.println();
                playing = false;
            } else if (money > 1000) {
                System.out.println();
                System.out.println("Mission Completed! You survived the night and made some money");
                System.out.println("You win!");
                System.out.println();
                playing = false;
            } else {
                System.out.println();
                System.out.println("The night continues...");
                System.out.println("Your health: " + health);
                System.out.println("Your money: " + money);
                System.out.println();
            }

        }

        System.out.println("Game Over!");
        get.close();
    }
}
