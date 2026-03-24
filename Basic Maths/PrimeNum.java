//Problem Statement: Given an integer N, check whether it is prime or not.
// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

public class PrimeNum {
    public static boolean isPrime(int n){
        if(n==0|| n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 1;
        if(isPrime(n))
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}
