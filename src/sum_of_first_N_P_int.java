import java.util.Scanner;
public class sum_of_first_N_P_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }
}
/*
How it works: Declare a sum variable starting at 0. Each loop iteration adds i to sum.
After the loop, print sum. This gives N*(N+1)/2.
 */