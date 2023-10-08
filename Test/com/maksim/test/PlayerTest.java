package com.maksim.test;

import com.Maksim.dice.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void playerTest (){
        Player player = new Player();


        assertNotNull(player);
        assertEquals(player.getClass(), Player.class);
    }


}