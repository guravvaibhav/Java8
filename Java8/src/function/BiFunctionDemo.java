package function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> b1=(i,j)->i*j;
		Function<Integer, Integer> b2=(i)->i+i;
//System.out.println(b2.apply(b1.apply(10,20)));
		System.out.println(b1.andThen(b2).apply(10, 20));
	}
	

}
