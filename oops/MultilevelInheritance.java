package p1;
class Person{
	int age;
	
	void showperson() {
		System.out.println("student age is : "+age);
	}
}
class Student extends Person{
	String name;
	void showstudent() {
		System.out.println("student name is :"+name);
	}
}
class Collegename extends Student{
	String college_name;
	void showcollegename() {
		System.out.println("college name is : "+college_name);
	}
}
  public class MultilevelInheritance{
	public static void main(String[] args) {
	Collegename c=new Collegename();
			c.age=22;
			c.name="priyal";
			c.college_name="MIT-ADT";
			
			c.showcollegename();
			c.showstudent();
			c.showperson();
}
		}	
		


