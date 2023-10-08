package com.Maksim.dice;

import java.util.Scanner;

public class Input {

    Scanner input = new Scanner(System.in);

    public int nextInt() {
        return input.nextInt();
    }

    public String nextLine() {
        return input.nextLine();
    }


    public void checkInt() {

        while (!input.hasNextInt()) {                             // Checks for valid input, will loop until valid input is provided
            System.out.println("Det är inte ett heltal!");
            input.next();
        }
    }

}
