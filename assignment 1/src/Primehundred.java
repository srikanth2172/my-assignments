public class Primehundred {
    public static void main(String[] args) {
        // Loop through all numbers between 10 and 99
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;

            // Check if i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print i if it is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

