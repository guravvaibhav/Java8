package unaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

// when our i/p and o/p is if same type use unery operator
// it is child of function
public class Demo {
public static void main(String[] args) {
//	UnaryOperator<Integer> u=i->i*i;
//	IntUnaryOperator u=i->i*i;
	DoubleUnaryOperator u=i->i*i;
//	System.out.println(u.apply(10));
//	System.out.println(u.applyAsInt(10));
	System.out.println(u.applyAsDouble(10));
	
	
}
}
