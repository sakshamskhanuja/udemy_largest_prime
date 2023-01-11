public class Main {
    public static void main(String[] args) {
        // Calculates the largest prime factor of 21
        System.out.println(getLargestPrime(21));

        // Calculates the largest prime factor of 217
        System.out.println(getLargestPrime(217));

        // Calculates the largest prime factor of 0
        System.out.println(getLargestPrime(0));

        // Calculates the largest prime factor of 45
        System.out.println(getLargestPrime(45));

        // Calculates the largest prime factor of -1
        System.out.println(getLargestPrime(-1));
    }

    /**
     * Calculates the largest prime factor.
     */
    public static int getLargestPrime(int number) {
        // Checks for invalid value.
        if (number < 0) {
            return -1;
        }

        // Stores the largest prime factor.
        int largestPrime = -1;
        for (int i = 2; i <= number; i++) {
            // Stores whether i is a prime number.
            boolean isPrime = true;

            // Checks if i is a prime number.
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if ((number % i == 0) && isPrime) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }
}