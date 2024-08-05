import java.util.*;

public class PrintNNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i != n) {
                System.out.print(" ");
            }
        }
    }
}
