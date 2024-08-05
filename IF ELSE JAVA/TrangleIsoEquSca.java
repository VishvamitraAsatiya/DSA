import java.util.*;
public class TrangleIsoEquSca{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter value of a ");
				int a = sc.nextInt();
					System.out.print("Enter value of b ");
				int b = sc.nextInt();
					System.out.print("Enter value of c ");
				int c = sc.nextInt();
				if( a==b || b==c)
				{ System.out.print(" equilatral");
				}
				else if ( b==c)
			    {
			        System.out.print(" isosceles");
			    }
			    else if ( a==c)
			    {
			        System.out.print(" scalence");
			    }
			    
			    
			    
		}
}
