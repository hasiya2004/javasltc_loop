import java.util.Scanner;
public class reverse_the_digits_in_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}
/*
How it works: Extract last digit with n % 10, build reversed number by multiplying reversed by 10 and adding digit.
 Divide n by 10 each step.
 */