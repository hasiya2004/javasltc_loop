import java.util.Scanner;
public class factorial_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println(n + "! = " + fact);
    }
}
/*
How it works: Factorial of N = 1×2×3×...×N. Start result at 1 and multiply by i in each loop iteration.
 Use long to handle large values.
 */