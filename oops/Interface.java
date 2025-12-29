package p1;
interface appliance{
	void turnon();
}
class Fan implements appliance{
	public void turnon() {
	System.out.println("fan is turned on");
}
}
class Light implements appliance{
	public void turnon() {
		System.out.println("light is turned on");
	}
}
public class Interface{
	public static void main(String[] args) {
appliance a;
a=new Fan();
a.turnon();
a=new Light();
a.turnon();
}
}
