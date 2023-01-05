package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("a", 1);
		hm.put("n", 9);
		hm.put("g", 67);
		hm.put("u", 0);
		hm.put("c", 3);
		hm.put("e", 5);
		hm.put("b", 2);
		                   
		System.out.println(hm);
		List<Entry<String, Integer>> hml=new ArrayList<>(hm.entrySet());
//		Comparator<Map.Entry<String, Integer>> c=(e1,e2)->e1.getValue().compareTo(e2.getValue());
		Comparator<Entry<String, Integer>> c=(e1,e2)->(e1.getValue()<e2.getValue())?-1:(e1.getValue()>e2.getValue())?1:0;
		Collections.sort(hml,c);
		System.out.println(hml);
		
	}

}
