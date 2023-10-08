package com.maksim.test;

import com.Maksim.dice.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    public void diceTest (){
        Dice dice = new Dice();

        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();
            assertTrue(result >=1 && result <= 6, "dice result out of range: " + result);
        }
        assertNotNull(dice);
        assertEquals(dice.getClass(), Dice.class);
    }



}