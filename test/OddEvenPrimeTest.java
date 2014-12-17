import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OddEvenPrimeTest {

    private OddEvenPrime printer;

    @Before
    public void setUp() throws Exception {
        printer = new OddEvenPrime();
    }

    @Test
    public void oneShouldReturnOdd() {
        assertThat(printer.evaluate(1), is("Odd"));
        assertThat(printer.evaluate(9), is("Odd"));
        assertThat(printer.evaluate(15), is("Odd"));
    }

    @Test
    public void twoShouldReturnEven() {
        assertThat(printer.evaluate(4), is("Even"));
        assertThat(printer.evaluate(6), is("Even"));
        assertThat(printer.evaluate(8), is("Even"));
    }

    @Test
    public void primeNumberShouldReturnPrime() {
        assertThat(printer.evaluate(2), is("Prime"));
        assertThat(printer.evaluate(3), is("Prime"));
        assertThat(printer.evaluate(5), is("Prime"));
        assertThat(printer.evaluate(31), is("Prime"));
    }
}
