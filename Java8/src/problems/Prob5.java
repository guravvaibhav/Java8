package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//5. Duplicates in List --

public class Prob5 {
	public static void main(String[] args) {
		List<String> companies = new ArrayList<>();
		companies.add("Meta");
		companies.add("Apple");
		companies.add("Amazon");
		companies.add("Netflix");
		companies.add("Meta"); // duplicate
		companies.add("Google");
		companies.add("Apple"); // duplicate
		
		System.out.println(companies);
		
		List<String> distinct = companies.stream().distinct().collect(Collectors.toList());
		for(String s:distinct) {
			companies.remove(s);
		}
		System.out.println(companies);
	}
}
