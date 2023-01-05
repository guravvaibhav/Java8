package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//	7. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//	List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
public class Prob7 {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> startWith_1 = myList.stream().map(i->i+"").filter(i->i.startsWith("1")).map(i->Integer.parseInt(i)).collect(Collectors.toList());
		System.out.println(startWith_1);
	}
}
