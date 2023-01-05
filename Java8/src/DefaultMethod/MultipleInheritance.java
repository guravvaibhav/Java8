package DefaultMethod;

public class MultipleInheritance implements Left,Right{ // compiletime error if both interface contains same method 
														// bcoz of ambugity 
														// we can solve this prob by overiding that common method

	@Override
	public void m() {
		System.out.println("our own method");	// you can can call your own method
		Left.super.m();							// you can can call Left Interface method
		Right.super.m();						// you can can call right Interface method (can call any interface method)
	}
	public static void main(String[] args) {
		MultipleInheritance t=new MultipleInheritance();
		t.m();
	}
}
