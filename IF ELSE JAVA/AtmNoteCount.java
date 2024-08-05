import java .util.*; 
public class AtmNoteCount
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in); 
	    int notes=0;
		System.out.println("the amount is:");
		int amount=sc.nextInt()
    
if( amount%100==0){
    

  if(amount >= 2000)
    {
        notes = amount/2000;
        amount = amount % 2000;
         System.out.println("2000 notes="+notes);
    }
   if(amount >=500)
    {
        notes = amount/500;
        amount = amount %500;
         System.out.println("500 notes="+notes);
    }
     if(amount >= 200)
    {
        notes= amount/200;
        amount = amount % 200;
         System.out.println("200 notes="+notes);
    }
     if(amount >= 100)
    {
        notes = amount/100;
        amount = amount%100;
         System.out.println("100 notes="+notes);}
	}
	else { System.out.println("invalid ");}
	
    
}
}
	
	
