//Problem Statement: Given two integers x and y, find their greatest common divisor.
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 2 numbers ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            while(x>0 && y>0){
                if(x>y)
                    x = x%y;
                else
                    y = y%x;
            }
            if(x==0)
                System.out.println("GCD of these numbers is "+y);
            else
                System.out.println("GCD of these numbers is "+x);
        }
    }
}
