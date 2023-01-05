package function;

import java.util.function.Function;

public class FunctionChaning {
	public static void main(String[] args) {
		
	Function<Integer, Integer> f1=i->2*i;
	Function<Integer, Integer> f2=i->i*i*i;
	
//	System.out.println(f1.andThen(f2).apply(5)); 	//first f1 then f2 calls on result of f1
	System.out.println(f1.compose(f2).apply(5));	//first f2 then f1 calls on result of f2
	}
	

}
