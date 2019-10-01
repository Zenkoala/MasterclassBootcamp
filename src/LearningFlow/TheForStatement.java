package LearningFlow;

public class TheForStatement {
    public static void main(String[] args) {
//        System.out.println("10000 @ 2% = " + calculateInterest(10000, 2.0));

//        for (int i = 0; i < 10; i++) {
//            System.out.println("10,000 at " + i + "% interest is " + calculateInterest(10000, i));
//        }
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println("10,000 at " + i + "% interest is " + calculateInterest(10000, i));
//        }

        int count = 0;
        for (int i = 234; i < 868; i++) {
            if (isPrime(i)){
                count++;
                System.out.println(i);
                if (count == 10) {
                    System.out.println("Exiting for Loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int printNum(int z) {
        for (int i = 0; i < 100; i++) {

        }
        return z;
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}
