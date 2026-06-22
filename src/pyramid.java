import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
/*
How it works: For a pyramid of height N, center-align each row.
Print spaces then numbers 1..i. The nested loops handle spacing and numbers separately.
 */