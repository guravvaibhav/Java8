package staticMethod;

public class Test implements Interf{
	public static void m() {						// we can overide static method in interface
		System.out.println("Test m");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m();
		
	Interf.m();								// can call static method from parent only by using interface name
	}										// can call static method in interface in child and non child class also

}
