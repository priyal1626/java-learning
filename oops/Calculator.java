package p1;


public class Calculator {
	
	void add(int a, int b) {
		int sum=a+b;
		System.out.println("the sum of 2 numbers is : "+sum);
		
	}
	
	void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("the sum of 3 numbers is :"+sum);
		
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add(2,3);
		c.add(2,4,6);
		
		
			}		
			
}
		
		
		
		
		


