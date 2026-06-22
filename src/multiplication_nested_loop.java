
public class multiplication_nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Table of " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
/*
How it works: Outer loop runs from 1 to 10 (each table number).
Inner loop runs from 1 to 10 (multiples). This gives 100 multiplications total.
 */