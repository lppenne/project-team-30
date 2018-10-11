package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShipTest {

    @Test
    public void testKindAssignment()
    {
        Ship ship = new Ship("MINESWEEPER");
        assertEquals(ship.getKind(), "MINESWEEPER");
    }
}
