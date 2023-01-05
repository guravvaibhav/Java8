package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionForGrade {
	public static void main(String[] args) {
		
	ArrayList<Student> al=new ArrayList<>();
	al.add(new Student("rushi",99));
	al.add(new Student("model",80));
	al.add(new Student("shree",70));
	al.add(new Student("vaibhav",35));
	al.add(new Student("pranav",50));
	
	Function<Student, String> f=s->{
		String grade="";
		if(s.getMarks()>80)
			grade="A [DISTINCTION";
		else if(s.getMarks()>60)
			grade="B [FIRST CLASS]";
		else if(s.getMarks()>=40)
			grade="C [SECOND CLASS]";
		else grade="[FAIL]";
		return grade;
	};
	Predicate<Student>p=s->s.getMarks()>60;
//	for(Student s:al) {
//		System.out.println(s+" GRADE:- "+f.apply(s));
//	}
	for(Student s:al) {
		if(p.test(s))
		System.out.println(s+" GRADE:- "+f.apply(s));
	}
	}

}
