import java.util.*;
public class Weather{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter temperature: ");
				int n = sc.nextInt();
				if(n<0){
						System.out.println("Freezing weather");
				}
				else if(n<10){
						System.out.println("Weather is very Cold");
				}
				else if(n<20){
						System.out.println("Weather is cold");
				}
				else if(n<30){
						System.out.println("Normal weather");
				}
				else if(n<40){
						System.out.println("It’s Hot");
				}
				else {
						System.out.println("Its very hot");
				}
		}
}