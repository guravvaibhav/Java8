package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmpSall {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("model",50000));
		al.add(new Employee("vaibhav",70000));
		al.add(new Employee("shree",90000));
		al.add(new Employee("rushikesh",55000));
		al.add(new Employee("pranav",65000));
		
		
		Predicate<Employee>p1=e->e.getSallary()>=60000;
		Predicate<Employee>p2=e->e.getName().contains("a");
		
//		for(Employee e:al) {
//			if(p1.test(e)) {
//				System.out.println(e);
//			}
		
//		for(Employee e:al) {
//			if(p1.and(p2).test(e)) {		
//				System.out.println(e);
//			}
//		}
		
//		for(Employee e:al) {
//			if(p1.or(p2).test(e)) {
//				System.out.println(e);
//			}
//		}
		
		for(Employee e:al) {
			if(p1.negate().test(e)) {
				System.out.println(e);
			}
		}
		
	}

}
