package p1;
import java.util.Scanner;

public class variabledemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter marks :");
		int marks=sc.nextInt();
		
		if(marks>=90) {
			System.out.println("grade A");
		}
		else if(marks<90 &&  marks>=80) {
			System.out.println("grade B");
		}
		else if(marks<80&&marks>=70) {
			
			System.out.println("grade C");
		}
		
		else if(marks<70&&marks>=60) {
			System.out.println("grade D");
		}
		
		else if(marks<60&& marks>=0) {
			
			System.out.println("FAIL");
			
		}
		
		else {
			
			System.out.println("invalid marks input");
		}
			}		
			
}
		
		
		
		
		


