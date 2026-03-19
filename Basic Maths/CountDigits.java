//Problem Statement:
//Given an integer N, return the number of digits in N.

public class CountDigits {

    static int countDigits(int n) {
        int count = (int) (Math.log10(n) + 1); // calculates the number of digits in 'n'
        // Adding 1 to the result accounts for the case when 'n' is a power of 10,
        return count;
    }

    public static void main(String[] args) {
        int N = 1000;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);                          
    }
}
