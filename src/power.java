import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base a: "); int a = sc.nextInt();
        System.out.print("Enter exponent b: "); int b = sc.nextInt();
        long result = 1;
        for (int i = 0; i < b; i++) result *= a;
        System.out.println(a + "^" + b + " = " + result);
    }
}
/*
How it works: Multiply a by itself b times using a loop. Start result at 1.
 Each iteration multiplies result by a. After b iterations, result holds a^b.
 */