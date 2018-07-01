import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PrimeNumbersTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void isPrimeShouldReturnTrueFor1() {
        assertTrue(PrimeNumbers.isPrime(1));
    }

    @Test
    public void isPrimeShouldReturnFalseFor4() {
        assertFalse(PrimeNumbers.isPrime(4));
    }

    @Test
    public void isPrimeShouldReturnFalseFor6() {
        assertFalse(PrimeNumbers.isPrime(6));
    }

    @Test
    public void isPrimeShouldReturnTrueFor2() {
        assertTrue(PrimeNumbers.isPrime(2));
    }

    @Test
    public void isPrimeShouldReturnFalseFor9() {
        assertFalse(PrimeNumbers.isPrime(9));
    }

    @Test
    public void isPrimeShouldReturnFalseFor16() {
        assertFalse(PrimeNumbers.isPrime(16));
    }

    @Test
    public void isPrimeShouldThrowExceptionFor0() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Please enter a number above 0");
        PrimeNumbers.isPrime(0);
    }

    @Test
    public void isPrimeShouldThrowExceptionForNegatives() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Please enter a number above 0");
        PrimeNumbers.isPrime(-1);
    }
}
