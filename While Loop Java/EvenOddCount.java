import java.util.*;

public class EvenOddCount {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
        int number = sc.nextInt();

         int oddCount = 0;
         int evenCount = 0;
         while (number > 0) {
            int r=number%10; 
            if(r%2==0){
             ++evenCount;
             }
         else {
             ++oddcount;
              }
              number=number/10;
         }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
   }