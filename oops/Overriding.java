package p1;
class Bank{
	float Intrest() {
		return 0;
	}
}	
class Sbi extends Bank{
	float Intrest() {
		return 2.1f;
	}
}
class Hdfc extends Bank{
	float Intrest() {
		return 2.2f;
	}
}
public class Overriding {

	public static void main(String[] args) {
	Bank b1=new Sbi();
	System.out.println("sbi intrest rate : "+b1.Intrest());
	
	Bank b2=new Hdfc();
	System.out.println("hdfc intrest rate :"+b2.Intrest());
	}	
}


