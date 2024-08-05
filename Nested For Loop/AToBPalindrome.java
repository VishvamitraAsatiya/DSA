
import java.util.*;

public class AToBPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int rev = 0;
           

            for (int j=i; j != 0; j = j / 10) {
                int r = j % 10;
                rev = rev * 10 + r;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}