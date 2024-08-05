import java.util.*;
public class StrongNoOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int sum=0;
        while(a>0){
            int r=a%10;
            int f=1;
            for(int i=1;i<=r;i++){
                f=f*i;
                
            }
            sum=sum+f;
            a=a/10;
            
        }
        if(sum==t){
            System.out.print("strong number");
        }else{
             System.out.print(" notstrong number");}
    }
}