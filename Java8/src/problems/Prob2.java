package problems;

import java.util.Arrays;
import java.util.stream.Collectors;

//	2. Sort Array Descending
//	Integer[] myarr = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
public class Prob2 {
	public static void main(String[] args) {
		Integer[] myarr = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		System.out.println(Arrays.stream(myarr).sorted((i,j)->j.compareTo(i)).collect(Collectors.toList()));
	}

}
