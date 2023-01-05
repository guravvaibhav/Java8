package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//	9. Given a String, find the first non-repeated character in it using Stream functions?
//	String input = "India is nice";
public class Prob9 {
	public static void main(String[] args) {
		String input = "India is nice";
		HashSet<Character>hs=new HashSet<>();
//		Stream.of(input.toCharArray()).filter(i->hs.add(()i)).collect(Collectors.toList());
//		input.chars().mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)).filter(i->hs.add(i)).collect(Collectors.toList());
		String n=input.toLowerCase();
		char[] cs = n.toCharArray();
//		Stream.of(cs).filter(i->hs.add(i)).collect(Collectors.toList())
	}
}
