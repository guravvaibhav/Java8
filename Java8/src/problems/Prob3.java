package problems;

import java.util.Arrays;
import java.util.stream.Collectors;

//	3. Sort an array and remove duplicates
//	Integer[] myarr = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
public class Prob3 {
	public static void main(String[] args) {
		Integer[] myarr = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		System.out.println(Arrays.stream(myarr).distinct().sorted().collect(Collectors.toList()));
	}
}
