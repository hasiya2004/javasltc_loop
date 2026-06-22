import java.util.Scanner;
public class all_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) { prime = false; break; }
            }
            if (prime) System.out.print(num + " ");
        }
    }
}
/*
How it works: For each number from 2 to N, apply the primality test from P17.
 If it passes, print it. This is a basic Sieve-like approach.
 */