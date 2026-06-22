import java.util.Scanner;
public class descending_oder_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}
/*
How it works: A while loop starts at N and decrements by 1 each iteration until it reaches 1.
 The condition checks i >= 1.
 */