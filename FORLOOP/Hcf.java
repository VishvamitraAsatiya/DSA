import java.util.*;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2= sc.nextInt();

        int hcf = 1;

        for (int i = 1; i <= n1 && i <=n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("The HCF/GCD of " + n1 + " and " + n2 + " is " + hcf + ".");
    }
}
