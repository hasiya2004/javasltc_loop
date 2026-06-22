import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = b; b = a + b; a = temp;
        }
    }
}
/*
How it works: Fibonacci: each term = sum of previous two.
Start with a=0, b=1. Print a, then update: temp=b, b=a+b, a=temp. Repeat N times.
 */