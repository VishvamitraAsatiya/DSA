import java.util.*;

public class PartyCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the total number of guests at the party: ");
        int totalGuests = sc.nextInt();
        
        if (totalGuests % 2 == 0) {
            System.out.println("Everyone at the party is in a couple");
        } 
        else {
            System.out.println("There is  one single person at the party.");
        }
    }
}
