import java.util.*;

public class PrintNumbersAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int A = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int B = sc.nextInt();

        for (int i = A; i <= B; i++) {
            System.out.print(i);
            if (i != B) {
                System.out.print(", ");
            }
        }
    }
}
