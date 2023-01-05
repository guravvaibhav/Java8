package problems;

import java.util.Arrays;

//	4. Sort an Array of primitive type
//	normal way & java8 way
//	int[] a = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
public class Prob4 {
	public static void main(String[] args) {
		int[] a = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		a=Arrays.stream(a).sorted().toArray();
		System.out.println(Arrays.toString(a));
	}

}
