import java .util.*;
	
public class FibonacciSequence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
        int f=0;
        int s=1;
        for ( int i=1; i<=n; i++)
         {
     if( i==1)
     { System.out.print (f);
     } else if (i==2)
     System.out.print (s);
     else { int c= f+s;
     System.out.print ("\n");
     System.out.print(c);
     f=s;
     s=c;
     }
}
}
}