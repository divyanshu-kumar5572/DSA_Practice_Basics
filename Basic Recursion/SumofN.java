//Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers 
import java.util.*;
public class SumofN {
    public static int sumOfNaturalNumbers(int N) {
        if (N == 1) {
            return 1;
        }
        return N + sumOfNaturalNumbers(N - 1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            System.out.println(sumOfNaturalNumbers(N));
        }
        
    }
}
