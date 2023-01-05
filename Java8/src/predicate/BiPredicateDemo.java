package predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> b1 = (i, j) -> i > j;
		BiPredicate<Integer, Integer> b2= (i, j) -> i+j > 40;
		System.out.println(b1.and(b2).test(40, 10));
	}

}
