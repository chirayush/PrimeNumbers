import java.util.stream.IntStream;

final class PrimeNumbers {
    static boolean isPrime(final int input) {
        if (input < 1) {
            throw new IllegalArgumentException("Please enter a number above 0");
        }

        return IntStream
                .range(2, input)
                .noneMatch(i -> (input % i) != 0);
    }
}
