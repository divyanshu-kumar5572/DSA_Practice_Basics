//Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.
// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int num = n;
        int digitCount = (int)Math.log10(n)+1;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, digitCount);      // Add ld^k
            n /= 10;                     // Remove digit
        }
        if (sum==num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
