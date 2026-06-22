import java.util.Scanner;
public class all_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}
/*
How it works: Loop from 1 to N and use the modulo operator (%). If i % 2 == 0, the number is even. Print only those.
 */