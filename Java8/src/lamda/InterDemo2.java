package lamda;
@FunctionalInterface
public interface InterDemo2 {
	static void m1() {
		System.out.println("static method of parent");
	}
	default void m2() {
		System.out.println("default method of parent");
		
	}
	default void m3() {
		System.out.println("default method of parent");
	}
	void m4();
}
