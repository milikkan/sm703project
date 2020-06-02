package sm703;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {
    @Test
    public void adds5And3Correctly() {
        Adder testAdder = new Adder(5, 3);
        assertEquals(8, testAdder.addNumbers());
    }
}