package problems;

import java.util.Arrays;
import java.util.List;

//	8. Given a list of integers, find the maximum value element present in it using Stream functions?
//	List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
public class Prob8 {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
//		int max=myList.stream().max((i,j)->i.compareTo(j)).get();
		int max=myList.stream().max(Integer::compareTo).get();
		System.out.println(max);
	}

}
