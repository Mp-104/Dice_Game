package com.maksim.test;

import com.Maksim.dice.Dice;
import com.Maksim.dice.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    public void diceTest (){
        Dice dice = new Dice();

        for (int i = 0; i < 1000; i++) {
            int result = dice.dice();
            assertTrue(result >=1 && result <= 6, "dice result out of range: " + result);
        }
        assertNotNull(dice);
    }



}