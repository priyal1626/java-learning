package p1;
class Student{
	private String name;
	private int marks;
	void setname(String n) {
		this.name=n;
	}
	String getname() {
		return name;
	}
	void setmarks(int m) {
		this.marks=m;
	}
	int getmarks() {
		return marks;
	}
}
public class Encapsulation{

	public static void main(String[] args) {
	Student s=new Student();
	s.setname("priyal");
	s.setmarks(760);
	
	System.out.println("name is : "+s.getname());
	System.out.println("marks are :"+s.getmarks());
		
}

}
