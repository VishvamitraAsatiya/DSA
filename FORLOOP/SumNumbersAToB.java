import java.util.*;

public class SumNumbersAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int A = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int B = sc.nextInt();

        int sum = (B * (B + 1) / 2) - ((A - 1) * A / 2);
        System.out.println("The sum of numbers from " + A + " to " + B + " is: " + sum);
    }
}
