package p1;
import java.util.Scanner;

public class ifelsedemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a :");
		int a=sc.nextInt();
		
		System.out.println("enter b :");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("a is greater");
			
			
		}
		else {
			System.out.println("b is greater");
		}
		
		System.out.println("enter your age : ");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("you are eligible to vote");
			
		}else {
			System.out.println("you cannot vote");
		}
	}

}

