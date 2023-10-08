package com.Maksim.dice;

import java.util.Random;

public class Dice {

    public int dice(){
        Random random = new Random();
        int dice = random.nextInt(1,7);
        return dice;

    }


}
