package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.assertTrue;



public class GameTest {

    @Test
    public void testRandCol(){
        Game someGame = new Game();

        char someCol = someGame.randCol();
        boolean isLetter = false;

        // Check if the random column is one of the first 10 letters
        // Does not check that the random col can be any of these, just that it is one of these
        if (someCol == 'A' || someCol == 'B' || someCol == 'C' ||
            someCol == 'D' || someCol == 'E' || someCol == 'F' ||
            someCol == 'G' || someCol == 'H' || someCol == 'I' ||
            someCol == 'J') {
            isLetter = true;
        }

        assertTrue(isLetter);
    }

    @Test
    public void testRandRow(){
        Game someGame = new Game();

        int someRow = someGame.randRow();

        boolean isRow = false;

        if (someRow < 11 && someRow > 0){
            isRow = true;
        }

        assertTrue(isRow);
    }
}