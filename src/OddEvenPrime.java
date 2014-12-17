import java.io.PrintStream;

public class OddEvenPrime {
    private final PrintStream printStream;

    public OddEvenPrime(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void evaluate() {
        printStream.println(1);
    }
}
