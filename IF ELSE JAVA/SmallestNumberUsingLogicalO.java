import java.util.*;

public class SmallestNumberUsingLogicalO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int smallest = num1;
        
        if (num2 < smallest && num2 < num3) {
            smallest = num2;
        } else if (num3 < smallest) {
            smallest = num3;
        }
        
        System.out.println("The smallest number is: " + smallest);
        
   
    }
}
