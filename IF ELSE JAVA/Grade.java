
import java.util.*;
public class Grade{  
    
public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    
    int m=sc.nextInt();  
      
    if(m<50){  
        System.out.println("fail");  
    }  
    else if(m>=50){  
        System.out.println("D grade");  
    }  
    else if(m>=60 ){  
        System.out.println("C grade");  
    }  
    else if(m>=70 ){  
        System.out.println("B grade");  
    }  
    else if(m>=80 ){  
        System.out.println("A grade");  
    }else if(m>=90){  
        System.out.println("A+ grade");  
    }
}  
}  