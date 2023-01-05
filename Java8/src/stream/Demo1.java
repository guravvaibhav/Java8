package stream;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(9);
		al.add(45);
		al.add(25);
		al.add(50);
		al.add(3);
		al.add(16);
		
//		System.out.println(al);
		List<Integer> even=al.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(even);
		
		List<Integer> l=al.stream().map(i->i*2).collect(Collectors.toList());
		l.forEach(e->System.out.println(e));									// froEach method
//		System.out.println(l);
	}

}
