package p1;


public class Student {
	int rollnum;
	String name;
	int age;
	
	void display() {
		System.out.println("rollnum :"+rollnum);
		System.out.println("name : "+name);
		System.out.println("age :"+age);
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.rollnum=37;
		s.name="priyal";
		s.age=19;
		
		s.display();
				
			}		
			
}
		
		
		
		
		


