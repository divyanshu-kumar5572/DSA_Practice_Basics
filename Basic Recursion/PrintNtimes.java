//Problem Description: Given an integer N, write a program to print your name N times.

public class PrintNtimes {
    public static void printName(String name, int count, int n){
        if(count==n){
            return;
        }
        System.out.println(name);
        printName(name, count+1, n);
    }
    public static void main(String[] args) {
        String name = "Divyanshu";
        int n = 4;
        printName(name, 0, n);
    }
}
