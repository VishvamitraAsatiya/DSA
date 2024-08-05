// import java.util.*;
// public class Main{
//      static int n=13;
//      static char a1='1',a2='2',a3='3',a4='4',a5='5',a6='6',a7='7',a8='8',a9='9';
//     //  static int n=13;
    
//       public static void iswon(){
     
//          if( a1==a2 && a2==a3){
//           return 1;
//      }
      
//          else if( a4==a5 && a5==a6){
//           return  1;
//      }
      
//          else if( a7==a8 && a8==a9){
//           return 1;
//      }
      
//          else if ( a1==a5 && a5==a9){
//           return 1;
//      }
      
//          else if( a3==a5 && a5==a7){
//           return 1;
//      }
     
//           else if( a1==a4 && a4==a7){
//           return 1;
//      }
     
//           else if( a2==a5 && a5==a8){
//           return 1;
//      }
     
//           else if( a7==a8 && a8==a9){
//          return 1;
//      }
//      else { return 0;
//      }
// }
//     public static void update(int n,char c){
//           switch(n){
//             case 1:a1=c;
//             break;
//             case 2:a2=c;
//             break;
//             case 3:a3=c;
//             break;
//             case 4:a4=c;
//             break;
//             case 5:a5=c;
//             break;
//             case 6:a6=c;
//             break;
//             case 7:a7=c;
//             break;
//             case 8:a8=c;
//             break;
//             case 9:a9=c;
//             break;
//         }
        
        
//     }
//       static void ab(){
          
//         //   int a=13;
//           for(int i=1;i<=a;i++){
//             for(int j=1;j<=a;j++){
//              if(j==5||j==9||i==5||i==9){
//                  System.out.print("* ");
//              }
//              else if(i==3&&j==3){
//                  System.out.print(a1+" ");
//              }
//              else if(i==3&&j==7){
//                  System.out.print(a2+" ");
//              }
//              else if(i==3&&j==11){
//                  System.out.print(a3+" ");
//              }
//              else if(i==7&&j==3){
//                  System.out.print(a4+" ");
//              }
//              else if(i==7&&j==7){
//                  System.out.print(a5+" ");
//              }
//              else if(i==7&&j==11){
//                   System.out.print(a6+" ");
//              }
//              else if(i==11&&j==3){
//                   System.out.print(a7+" ");
//              }
//              else if(i==11&&j==7){
//                   System.out.print(a8+" ");
//              }
//              else if(i==11&&j==11){
//                   System.out.print(a9+" ");
//              }
//              else{
//                  System.out.print("  ");
//              }
             
//             }
//                          System.out.println();
                         
//         }
//       }
     
     

    
//     public static void main(String[] args){
//   Scanner sc=new Scanner(System.in);
     
//        int z=0;
// 	   int i=0;
//     //  System.out.print(ab);
//     for(int i=1;i<=9;i++){
//         char c;
//         System.out.print("\033[H\033[2J");  
//         System.out.flush();
//       ab();
//       System.out.println();
        
//         if(i%2!=0){
//             c='x';
//             System.out.print("1player");
//         }else{
//             c='0';
//              System.out.print("2player");
//         }
        
//         int n=sc.nextInt();
//         update(n,c);

//          z =iswon();
//        if (z==1)
//        break;
//     }
//         System.out.print("\033[H\033[2J");  
//         System.out.flush();
    
//       ab();
//     if( z==0){
//            System.out.print("Draw Game");
        
//     } else {
//         if (i%2==1)
//         { System.out.print( " 1 player IS WON");
//     } else
    
//            { System.out.print("2 player IS WON");
//     }
//   }
// }
            
//    }     
         
        
import java.util.*;
public class DifferenceTwoNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int l=n%10;
		int temp = n;
		int c=0;
		int f=0;
		while(n>0){
		    f=n%10;
		    c++;
		    n=n/10;
		}
		n=temp;
		n=n/10;
		n=n*10+f;
		n=n%(int)Math.pow(10,c-1);
		n=l*(int)Math.pow(10,c-1)+n;
		System.out.println("Number after swapping: "+n);
	}
}