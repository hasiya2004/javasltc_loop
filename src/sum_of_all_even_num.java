import java.util.Scanner;
public class sum_of_all_even_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("Sum of evens = " + sum);
    }
}
/*
How it works: Loop from 1 to N, check if each number is even (i % 2 == 0), and add it to the running sum if true.
 */