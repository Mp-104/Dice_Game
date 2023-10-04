package com.Maksim.dice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // amount of players
        // amount of rounds
        // amount of dices

        // instantiate

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //Variables
        ArrayList<Player> playerlist = new ArrayList<>();



        System.out.println("Välkommen till tärning! Hur många spelar? Ange ett heltal");
        while (!scanner.hasNextInt()) {                             // Checks for valid input, will loop until valid input is provided
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int players = scanner.nextInt();                            // Variable used for amount of players, used in fori loop later
        System.out.println(players + " Spelare");


        System.out.println(); // Radbrytning


        System.out.println("Hur många rundor? Ange ett heltal");
        while (!scanner.hasNextInt()) {                              // Checks for valid input, will loop until valid input is provided
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int rounds = scanner.nextInt();                              // Variable used for amount of rounds, used in fori loop later
        System.out.println(rounds + " Rundor");

        System.out.println(); // Radbrytning

        System.out.println("Hur många tärningar? Ange ett heltal!");
        while (!scanner.hasNextInt()) {                              // Checks for valid input, will loop until valid input is provided
            System.out.println("Det är inte ett heltal");
            scanner.next();
        }
        int dices = scanner.nextInt();                               // Variable used for amount of dices, used later to in fori loop
        System.out.println(dices + " Tärningar");

        scanner.nextLine();   // player1.name = scanner.nextLine(); below was skipped, for some reason, this line prevents that and is skipped instead


        System.out.println(); // Radbrytning


        for (int i = 0; i < players; i++) {   // Loops for the amount of chosen players

            //create Unique players
            System.out.println("Ange namn för spelare " + (i+1 )); // +1 to better represent amount of players
            Player player = new Player ();                        // Creates new player
            player.name = scanner.nextLine();                     // User names new player

            System.out.println("Spelare " + (i+1) + ": " + player.name);
            playerlist.add(player);                                         // Adds new player to ArrayList
            System.out.println(); // Radbrytning

        }


        System.out.println("Medverkande spelare: ");
        for (int i = 0; i < playerlist.size(); i++) {  // Lists participating players by name

            System.out.println(playerlist.get(i).name);

        }

        System.out.println(); // Radbrytning
        System.out.println("Tryck enter för att börja spelet");
        scanner.nextLine();
        System.out.println(); // radbrytning


        // Game logic
        for (int i = 0; i < rounds; i++) {   // Loops for the amount of chosen rounds
            System.out.println("Runda " + (i+1) );
            System.out.println("Tryck enter för att fortsätta");
            scanner.nextLine();

            for (int j = 0; j < playerlist.size(); j++) {  // Loops for each player in the ArrayList
                System.out.println(playerlist.get(j).name + "'s tur");
                System.out.println("Tryck enter för att slå tärning");
                scanner.nextLine();


                for (int k = 0; k < dices; k++) {                 // Loops for amount of chosen dices
                    int dice = random.nextInt(1,7);  // Simulates dice throw
                    System.out.println("Tärning " + (k+1) + ": " + dice);

                    playerlist.get(j).score += dice;              // Tallies the score

                }
                System.out.println(playerlist.get(j).name + " har " + playerlist.get(j).score + " poäng!") ;
                System.out.println(); // Radbrytning


            }
        }




        System.out.println("Tryck enter för en sammanställning av resultatet");
        scanner.nextLine();

        System.out.println(); // Radbrytning
        System.out.println("Slutresultatet: ");


        // Calculate winner
        Collections.sort(playerlist , Collections.reverseOrder()); // sorts playerlist in reverse order based on int score, implements sorting interface in Player class

        for (int i = 0; i < playerlist.size(); i++) {
            System.out.println(playerlist.get(i).score + " poäng: " + playerlist.get(i).name); // presents players in descending order
        }
        if (playerlist.size() > 1) {  // checks if more than one player present
            if (playerlist.get(0).score == playerlist.get(1).score) {    // Compares top two players based on score
                System.out.println(); // Radbrytning
                System.out.println("Det blev oavgjort");

            } else {
                System.out.println(); // Radbrytning
                System.out.println(playerlist.get(0).name + " Vann!");      // Declares a winner if more than 1 player and not == score

            }
        }
    }
}
