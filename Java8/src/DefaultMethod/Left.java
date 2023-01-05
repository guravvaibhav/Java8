package DefaultMethod;

public interface Left {
	default void m() {
		System.out.println("left interface method");
	}


}
