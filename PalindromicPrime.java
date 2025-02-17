public class PalindromicPrime {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    // Method to check if a number is palindromic
    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        int count = 0; // To count how many palindromic primes we have found
        int number = 2; // Starting from the smallest prime number

        while (count < 100) { // Find the first 100 palindromic primes
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) { // Print 10 numbers per line
                    System.out.println();
                }
            }
            number++; // Check the next number
        }
    }
}
