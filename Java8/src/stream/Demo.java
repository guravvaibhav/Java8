package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(70);
		al.add(38);
		al.add(7);
		al.add(103);
		
		System.out.println(al);
		List l= al.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());	// sorting
		System.out.println(l);
		
		int large=al.stream().sorted((i,j)->j.compareTo(i)).findFirst().get();		// large num
		System.out.println(large);
		
		int small=al.stream().max((i,j)->i.compareTo(j)).get();		//// small num
		System.out.println(small);
	}

}
