final class PrimeNumbers {
    static boolean isPrime(final int input) {
        if (input < 1) {
            throw new IllegalArgumentException("Please enter a number above 0");
        }

        if (input == 2) {
            return true;
        }

        for (int i = 2; i < input; i++) {
            if ((input % i) != 0) {
                return false;
            }
        }

        return true;
    }
}
