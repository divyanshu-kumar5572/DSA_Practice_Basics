//Problem Statement: Given an integer N return the reverse of the given number.

import java.util.*;
public class ReverseNumber {
    public static int reverseNumber(int n) {
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n /= 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int reverse = reverseNumber(n);
            System.out.println("Reversed Number: "+reverse);
        }
    }
}
