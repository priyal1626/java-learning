package p1;
import java.util.Scanner;

public class variabledemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter you name : ");
		String name=sc.nextLine();
		
		System.out.println("enter your age : ");
		int age=sc.nextInt();
		
		System.out.println("enter amount :");
		float amount=sc.nextFloat();
		
		System.out.println("--------details-------");
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("amount : "+amount);

	}

}
