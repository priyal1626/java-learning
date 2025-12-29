package p1;


public class Student {
	int rollnum;
	String name;
	int age;
	
	Student(int r,String n,int a){
		this.rollnum=r;
		this.name=n;
		this.age=a;
		
		
	}
	
	void display() {
		
		System.out.println("rollnum : " + rollnum);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
		
	}
	public static void main(String[] args) {
		
		Student s = new Student(37, "Priyal", 19);
        s.display();
		
			}		
			
}
		
		
		
		
		


