package java8;

interface PerformOperation {
    boolean check(int n);
}

public class LambdaOperations {

    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1)
                return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        };
    }

    public static PerformOperation isPalindrome() {

        return n -> {

            int original = n;
            int reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }

            return original == reverse;
        };
    }

    public static void main(String[] args) {

        System.out.println("15 is Odd? " + isOdd().check(15));

        System.out.println("17 is Prime? " + isPrime().check(17));

        System.out.println("121 is Palindrome? " +
                isPalindrome().check(121));
    }
}