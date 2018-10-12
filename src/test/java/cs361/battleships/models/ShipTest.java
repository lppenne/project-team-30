package cs361.battleships.models;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShipTest {

    @Test
    public void testConstructor()
    {
        // test kind setting works
        Ship ship = new Ship("BATTLESHIP");
        assertEquals(ship.getKind(), "BATTLESHIP");
        // test getting occupiedSquares works
        assertTrue(ship.getOccupiedSquares() instanceof List);
        // test initial size of occupiedSquare
        assertEquals(4, ship.getSize());
    }

    @Test
    public void testOccupiedSquares()
    {
        Ship ship = new Ship("BATTLESHIP");

        // test adding squares
        ship.getOccupiedSquares().add(new Square(1, 'A'));
        ship.getOccupiedSquares().add(new Square(1, 'B'));
        ship.getOccupiedSquares().add(new Square(1, 'C'));
        ship.getOccupiedSquares().add(new Square(1, 'D'));
        assertEquals(4, ship.getOccupiedSquares().size());
    }
}
