import java.util.Scanner;
public class all_odd_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
    }
}
/*
How it works: Same as evens, but check i % 2 != 0 (or i % 2 == 1). Odd numbers leave a remainder of 1 when divided by 2.
 */