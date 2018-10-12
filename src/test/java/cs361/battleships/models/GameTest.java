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

    // Tests whether booleans are generated randomly. If the same bool is returned more than 20 times in a row, it's
    // probably not random. Probability of this happening for random bool is 1/(2^20) = 1/1,048,576
    @Test
    public void testRandVerical(){
        Game someGame = new Game();

        boolean isVertical;
        boolean wasVertical = someGame.randVertical();
        boolean isNotSame = false;

        for (int i=1; i<20; i++){
            isVertical = someGame.randVertical();

            if (isVertical != wasVertical){
                isNotSame = true;
            }

            wasVertical = isVertical;
        }

        assertTrue(isNotSame);

    }
}