package p1;
class Person {
	int rollnum;
	String name;
	
	void callperson() {
	
		System.out.println("name is : "+name);
		System.out.println("rollnum is : "+rollnum);
	}
	}

class Student extends Person{
	int age;
	void callstudent() {
		System.out.println("age is : "+age);
		
	}
}
	public class SingleInheritance{
	public static void main(String[] args) {
		Student s=new Student();
		
		s.name="priyal";
		s.age=19;
		s.rollnum=37;
		s.callperson();
		s.callstudent();
}
		
	}
		
		
		


