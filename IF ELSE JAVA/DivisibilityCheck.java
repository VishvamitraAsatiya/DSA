import java.util.*;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Coding Thinker");
        } else if (number % 2 == 0) {
            System.out.println("Coding");
        } else if (number % 3 == 0) {
            System.out.println("Thinker");
        } else {
            System.out.println("The number is not divisible by 2 or 3.");
        }
        
    }
}
