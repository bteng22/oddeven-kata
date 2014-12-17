import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OddEvenPrimeTest {

    @Test
    public void shouldPrintNumbers() {
        PrintStream printStream = mock(PrintStream.class);
        OddEvenPrime printer = new OddEvenPrime(printStream);
        printer.evaluate();
        verify(printStream).println(1);
    }


}
