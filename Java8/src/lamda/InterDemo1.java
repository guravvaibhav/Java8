package lamda;
@FunctionalInterface			// the interface having only one abstract method
public interface InterDemo1 {
	void m();
	
	static void m2() {
		System.out.println("static method of parent");
	}
	default void m3() {
		System.out.println("default method of parent");
	}
}
