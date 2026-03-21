//Problem Description: Given an integer N, write a program to print numbers from 1 to N.

public class Print1toN {
    public static void printNumb(int current, int n){
        if (current > n)
            return;
        System.out.print(current + " ");

        printNumb(current + 1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumb(1, n);
    }
}
