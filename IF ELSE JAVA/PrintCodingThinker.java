import java.util.*;

public class PrintCodingThinker
{

  public static void main (String[]args)
  {

	Scanner sc = new Scanner (System.in);

	  System.out.print ("Enter a Number: ");

	int n = sc.nextInt ();

	if (n % 2 == 0)
	  {

		if (n % 3 == 0)
		  {

			System.out.println ("Coding Thinker");

		  }

		else
		  {

			System.out.println ("Coding");

		  }

	  }

	else
	  {

		if (n % 3 == 0)
		  {

			System.out.println ("Thinker");

		  }

	  }

  }

}
