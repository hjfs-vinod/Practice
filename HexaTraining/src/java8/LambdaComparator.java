package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparator {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("vinod", 1));
		al.add(new Employee("kumar", 3));
		al.add(new Employee("masina", 2));
		al.add(new Employee("satyanarayana", 4));

		//Comparator<Employee> empC = ( e1,  e2) -> (int) (e2.id - e1.id);
		Collections.sort(al, ( e1,  e2) -> (e1.name.length() - e2.name.length()));
		
		al.forEach((item)->{System.out.println(item);});
		//System.out.println(al);
		
	}
}
