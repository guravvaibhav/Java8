package lamda;

public class Test {
	
	public static void main(String[] args) {
		

	InterDemo1 i=()->{System.out.println("Shree !!");};   // object by using lambda expression
	i.m();
	InterDemo1.m2();
	i.m3();
		
	InterDemo1 id=	new InterDemo1() {					// object by using inline implementation
		public void m() {
			System.out.println("m method");
		}
	};
	
	id.m();
	
}
}
