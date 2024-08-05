import java .util.*; 
public class ProfitLoss
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in);
	   
		System.out.println("enter the va;lue of cost price");
		int cp=sc.nextInt();
		
		System.out.println("enter the va;lue of selling price");
		int sp=sc.nextInt();
		if (sp>cp ){
		    System.out.print( " profit");
		}
        else {
            System.out.print( " loss");
        }


	}
	
	
}
