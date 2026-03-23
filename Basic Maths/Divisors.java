//Problem Statement: Given an integer N, return all divisors of N.
import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        int N = 30;
        // Loop from 1 to square root of N
        for (int i = 1; i * i <= N; i++) {
            // Check if i divides N
            if (N % i == 0) {
                // Add i to result
                res.add(i);

                // If N / i is different from i, add N / i too
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        System.out.println(res);
    }
}
