package DefaultMethod;

public interface Right {
	default void m() {
		System.out.println("right m method");
	}

}
