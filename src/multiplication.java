import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
/*
How it works: Take a number from the user. Use a for loop from 1 to 12, printing num × i = result each iteration.
 */