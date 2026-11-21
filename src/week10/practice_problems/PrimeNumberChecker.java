public class PrimeNumberChecker {
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n + " is prime");
    }

    public static void main(String[] args) {
        checkPrime(29);
        checkPrime(21);
    }
}
