package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class ResultTest {

    @Test
    public void testMiss() {
        Square location = new Square(1, 'A');
        Result resultMiss = new Result(location, AttackStatus.MISS, null);

        assertEquals(resultMiss.getResult(), AttackStatus.MISS);

        assertEquals(resultMiss.getLocation(), location);

        assertNull(resultMiss.getShip());
    }

    @Test
    public void testDefautConstructor() {
        Result someResult = new Result();

        assertNull(someResult.getLocation());
        assertNull(someResult.getResult());

        Square location = new Square(2, 'B');

        someResult.setLocation(location);
        // Note: whenever AttackStatus is HIT, there should be a non-null ship in the result
        someResult.setResult(AttackStatus.HIT);

        assertEquals(someResult.getResult(), AttackStatus.HIT);
        assertEquals(someResult.getLocation(), location);
    }
}