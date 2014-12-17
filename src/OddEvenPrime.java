public class OddEvenPrime {

    public String evaluate(int number) {

        if(number == 1) {
            return "Odd";
        } else if (number == 2) {
            return "Prime";
        } else if (number == 3) {
            return "Prime";
        }
        
        if(!isEven(number) && number % 3 != 0) {
            return "Prime";
        }

//        for(int i = 2; i < number; i++) {
//            if (isOdd(number) && number % i != 0 ) {
//                return "Prime";
//            }
//        }

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
