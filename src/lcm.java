import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: "); int a = sc.nextInt();
        System.out.print("Enter b: "); int b = sc.nextInt();
        int x = a, y = b;
        while (b != 0) { int t = b; b = a % b; a = t; }
        System.out.println("LCM = " + (x / a * y));
    }
}
/*
How it works: LCM(a,b) = (a × b) / GCD(a,b). First find GCD using the loop method, then divide the product by GCD.
 */