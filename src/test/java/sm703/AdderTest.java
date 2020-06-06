package sm703;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    Adder adder = new Adder();

    @Test
    public void resultIs8When3And5Added() {
        assertEquals(8, adder.addNumbers(3, 5));
    }
}