public class Main {

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
           return true;
    }

    public static void main(String[] args) {
        int n = 10; // given number
        int count = 0;

        for (int i = 1; i < n; i++) { // exclude 10
            if (isPrime(i)) {
                count++;
            }
         }

        System.out.println("Count of primes from 1 to " + (n - 1) + " is: " + count);
    }
}
