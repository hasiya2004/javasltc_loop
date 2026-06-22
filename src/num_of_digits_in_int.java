import java.util.Scanner;
public class num_of_digits_in_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        if (n == 0) { System.out.println("Digits: 1"); return; }
        n = Math.abs(n);
        int count = 0;
        while (n > 0) { n /= 10; count++; }
        System.out.println("Number of digits: " + count);
    }
}
/*
How it works: Repeatedly divide the number by 10 and count iterations until it becomes 0.
Each division removes the last digit. Handle 0 as a special case.
 */