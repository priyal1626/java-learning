package p1;
import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a :");
		int a=sc.nextInt();
		
		
		boolean isprime=true;
		
		if(a<=1) {
			isprime=false;
		}
		else{
			for(int i=2;i<a;i++)
		{
				if(a%i==0) {
					isprime=false;
					break;
				}
			
		}
			}
		
		if(isprime) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
			
	}		
			
}
		
		
		
		
		

