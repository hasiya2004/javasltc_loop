import java.util.Scanner;
public class check_num_is_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt(), original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(original + (original == reversed ? " is" : " is not") + " a palindrome");
    }
}
/*
How it works: Reverse the digits (same as P11) and compare the result to the original.
If equal, it reads the same forward and backward.
 */