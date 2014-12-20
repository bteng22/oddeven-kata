public class OddEvenPrime {

    public String evaluate(int number) {

        if (number == 1) return "Odd";

        if (isPrime(number)) return "Prime";

        if (isEven(number)) return "Even";

        if (isOdd(number)) return "Odd";

        return String.valueOf(number);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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
