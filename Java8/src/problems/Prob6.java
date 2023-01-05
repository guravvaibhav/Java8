package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//	6. Count of Duplicates -
// 3, 4, 1, 9
//	List<Integer> list = Arrays.asList(5, 3, 4, 1, 1,3, 7, 1, 2, 9, 9, 4);
public class Prob6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 1,3, 7, 1, 2, 9, 9, 4);
		HashSet<Integer> hs=new HashSet<>();
		List<Integer> list2 = list.stream().filter(n->!hs.add(n)).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list2.size());
	}

}
