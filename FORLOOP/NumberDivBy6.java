import java.util.*;

public class NumberDivBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int flag = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % 6 == 0) {
                flag = 1;
                break;
            }
        }
        
        if (flag == 1) {
            System.out.println("Yes, the number is divisible by 6.");
        } else {
            System.out.println("No, the number is not divisible by 6.");
        }
    }
}

