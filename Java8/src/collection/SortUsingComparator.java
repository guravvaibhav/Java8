package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingComparator {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(24);
		al.add(92);
		System.out.println(al);
//		Comparator<Integer> c=(i1,i2)->i2.compareTo(i1); 
		Comparator<Integer> c=(i,j)->(i<j)?-1:(i>j)?+1:0;
		Collections.sort(al,c);
		System.out.println(al);
		
		Integer []x=al.stream().toArray(Integer []::new );
		
		int l=al.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(l);
	}

}
