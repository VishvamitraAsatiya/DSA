import java.util.*;

public class PalindromNum{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = sc.nextInt();

       int originalNumber = n;
       int reverseNumber = 0;

       while (n != 0) {
       int remainder = n % 10;
       reverseNumber = reverseNumber * 10 + remainder;
       n = n / 10;
      }

       if (originalNumber == reverseNumber) {
        System.out.println(originalNumber + " is a palindrome number.");
}
        else {
        System.out.println(originalNumber + " is not a palindrome number.");
 }
 }
}
