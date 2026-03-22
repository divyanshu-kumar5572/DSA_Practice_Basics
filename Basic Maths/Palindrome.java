//Problem Statement: Given an integer N, return true if it is a palindrome else return false.

public class Palindrome {
    public static void main(String[] args){
        int n = 1221;
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }
        if(temp==rev)
            System.out.println(temp+" is Palindrome");
        else
            System.out.println(temp+" is not a palindrome");
    }
}
