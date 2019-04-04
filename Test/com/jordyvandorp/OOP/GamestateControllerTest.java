package com.jordyvandorp.OOP;

import org.junit.Test;

import static org.junit.Assert.*;

public class GamestateControllerTest {
    private GamestateController gamestateController = new GamestateController();

    @Test
    public void testMoveLeftToEmptySpace() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 1;
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToKey100() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 2;
        gamestateController.player.setSleutelInBezit(2);
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToKey200() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 3;
        gamestateController.player.setSleutelInBezit(2);
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToKey300() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 4;
        gamestateController.player.setSleutelInBezit(3);
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToWall() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 5;
        assertFalse(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade100() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 6;
        gamestateController.player.setSleutelInBezit(2);
        gamestateController.player.getSleutelInBezit();
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade100WrongKey() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 6;
        gamestateController.player.setSleutelInBezit(4);
        gamestateController.player.getSleutelInBezit();
        assertFalse(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade200() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 7;
        gamestateController.player.setSleutelInBezit(3);
        gamestateController.player.getSleutelInBezit();
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade200WrongKey() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 7;
        gamestateController.player.setSleutelInBezit(2);
        gamestateController.player.getSleutelInBezit();
        assertFalse(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade300() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 8;
        gamestateController.player.setSleutelInBezit(4);
        gamestateController.player.getSleutelInBezit();
        assertTrue(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToBarricade300WrongKey() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 8;
        gamestateController.player.setSleutelInBezit(3);
        gamestateController.player.getSleutelInBezit();
        assertFalse(gamestateController.moveLeft());
    }

    @Test
    public void testMoveLeftToExit() throws Exception {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY() - 1] = 9;
        assertTrue(gamestateController.moveLeft());
    }

    /*@Test
    public void testGotoLeft() {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.gotoLeft();
        assertTrue(gamestateController.isMoveAllowed());
    }*/

    @Test
    public void testGotoLeftHuidigeLocatie() {
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.gotoLeft();
        int expResult = 0;
        int result = gamestateController.map[gamestateController.player.getHuidigeLocatieX()][gamestateController.player.getHuidigeLocatieY()];
        assertEquals(expResult, result);
    }

    /*@Test
    public void testIsMoveAllowedAfterGotoLeft() throws Exception{
        gamestateController.player.setHuidigeLocatieY(5);
        gamestateController.player.setHuidigeLocatieX(5);
        gamestateController.gotoLeft();
        assertTrue(gamestateController.isMoveAllowed());
    }

    @Test
    public void testIsMoveAllowed() throws Exception{
        assertFalse(gamestateController.isMoveAllowed());
    }

    @Test
    public void testSetMoveAllowed() throws Exception{
        gamestateController.setMoveAllowed(true);
        assertTrue(gamestateController.isMoveAllowed());
    }*/
}