
import java .util.*; 
public class CharacterUpperLowerCase
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in); 
	    
	    System.out.print(" alphabet:  ");
	    char c= sc.next().charAt(0);
	    
	    if ( c>='a' && c<='z' )
	    { System.out.print(" alphabet is lower case ");}
	    else {
        System.out.print(" alphabet is upper case ");}
	}
}
