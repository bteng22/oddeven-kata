public class OddEvenPrime {

    public String evaluate(int number) {

        if (isEven(number)) return "Even";

        if (isOdd(number)) return "Odd";

        return String.valueOf(number);
    }

    private boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    private boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
