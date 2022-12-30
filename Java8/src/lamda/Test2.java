package lamda;

public class Test2 implements InterDemo2{
	public static void main(String[] args) {
	InterDemo2 id=new InterDemo2	() {
	public void m1() {
		System.out.println("m1 method of child");
		
	}
	public void m2() {
		System.out.println("m2 methid of child");
	}
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	};
	id.m2();
	InterDemo2.m1();
}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
