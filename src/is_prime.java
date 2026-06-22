import java.util.Scanner;
public class is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean prime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { prime = false; break; }
        }
        System.out.println(n + (prime ? " is prime" : " is not prime"));
    }
}
/*
How it works: A prime number is divisible only by 1 and itself.
 Check divisors from 2 to √n. If any divide n evenly, it is not prime.
 */