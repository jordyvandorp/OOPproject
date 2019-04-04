package com.jordyvandorp.OOP;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player player = new Player(4, 10, 0);

    @Test
    public void getHuidigeLocatieX() throws Exception {
        assertEquals(4, player.getHuidigeLocatieX());
    }

    @Test
    public void setHuidigeLocatieX() {
        player.setHuidigeLocatieX(6);
        assertEquals(6, player.getHuidigeLocatieX());
    }

    @Test
    public void getSleutelInBezit() {
        assertEquals(0, player.getSleutelInBezit());
    }

    @Test
    public void setSleutelInBezit() {
        player.setHuidigeLocatieX(1);
        assertEquals(1, player.getHuidigeLocatieX());
    }

    @Test
    public void getHuidigeLocatieY() {
        assertEquals(10, player.getHuidigeLocatieY());
    }

    @Test
    public void setHuidigeLocatieY() {
        player.setHuidigeLocatieY(3);
        assertEquals(3, player.getHuidigeLocatieY());
    }
}