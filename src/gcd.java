import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); int a = sc.nextInt();
        System.out.print("Enter b: "); int b = sc.nextInt();
        while (b != 0) { int temp = b; b = a % b; a = temp; }
        System.out.println("GCD = " + a);
    }
}
/*
How it works: Use the Euclidean algorithm: repeatedly replace (a,b) with (b, a%b) until b becomes 0.
The remaining a is the GCD.
 */