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
        while (!scanner.hasNextInt()) {                         // while loopen fortsätter köra scanner tills den får integer
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int players = scanner.nextInt();
        System.out.println(players + " Spelare");


        System.out.println(); // Radbrytning


        System.out.println("Hur många rundor? Ange ett heltal");
        while (!scanner.hasNextInt()) {
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int rounds = scanner.nextInt();
        System.out.println(rounds + " Rundor");

        System.out.println(); // Radbrytning

        System.out.println("Hur många tärningar? Ange ett heltal!");
        while (!scanner.hasNextInt()) {
            System.out.println("Det är inte ett heltal");
            scanner.next();
        }
        int dices = scanner.nextInt();
        System.out.println(dices + " Tärningar");

        scanner.nextLine();   // player1.name = scanner.nextLine(); below was skipped, for some reason, this line prevents that and is skipped instead


        System.out.println(); // Radbrytning


        for (int i = 0; i < players; i++) {

            //create Unique players
            System.out.println("Ange namn för spelare " + (i+1 )); // +1 to better represent amount of players
            Player player = new Player ();
            player.name = scanner.nextLine();

            System.out.println("Spelare " + (i+1) + ": " + player.name);
            playerlist.add(player);
            System.out.println(); // Radbrytning

        }


        System.out.println("Medverkande spelare: ");


        for (int i = 0; i < playerlist.size(); i++) {

            System.out.println(playerlist.get(i).name);

        }

        System.out.println(); // Radbrytning
        System.out.println("Tryck enter för att börja spelet");
        scanner.nextLine();
        System.out.println(); // radbrytning

        for (int i = 0; i < rounds; i++) {   // rounds är en variabel som spelare matar in med en int, loopen körs så många ggr
            System.out.println("Runda " + (i+1) );
            System.out.println("Tryck enter för att fortsätta");
            scanner.nextLine();

            for (int j = 0; j < playerlist.size(); j++) {
                System.out.println(playerlist.get(j).name + "'s tur");
                System.out.println("Tryck enter för att slå tärning");
                scanner.nextLine();


                for (int k = 0; k < dices; k++) {
                    int dice = random.nextInt(1,7);
                    System.out.println("Tärning " + (k+1) + ": " + dice);

                    playerlist.get(j).score += dice;


                }
                System.out.println(playerlist.get(j).name + " har " + playerlist.get(j).score + " poäng!") ;
                System.out.println(); // Radbrytning



            }



        }

        System.out.println("Tryck enter för en sammanställning av resultatet");
        scanner.nextLine();

        System.out.println(); // Radbrytning
        System.out.println("Slutresultatet: ");

        Collections.sort(playerlist , Collections.reverseOrder());

        for (int i = 0; i < playerlist.size(); i++) {
            System.out.println(playerlist.get(i).score + " poäng: " + playerlist.get(i).name);
        }
        if (playerlist.size() > 1) {
            if (playerlist.get(0).score == playerlist.get(1).score) {
                System.out.println(); // Radbrytning
                System.out.println("Det blev oavgjort");

            } else {
                System.out.println(); // Radbrytning
                System.out.println(playerlist.get(0).name + " Vann!");

            }
        }
    }
}
