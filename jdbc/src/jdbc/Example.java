package jdbc;

class Base{
	public void fun() {
		System.out.println("Base fun");
	}
}
class Derived extends Base{
	public void fun() {
		System.out.println("Derived fun");
	}
}
public class Example {
	public static void main(String[] args) {
		Base obj = new Base();
		obj.fun();
	}
}
