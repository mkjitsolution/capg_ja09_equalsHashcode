package p1;

import java.util.HashSet;
import java.util.Set;


public class SetInsertionDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "A");  // 102
		Employee e2 = new Employee(102, "xyz");  // 105
		Employee e3 = new Employee(103, "pq");  // 105
		Employee e4 = new Employee(101, "A");  // 102
		Employee e5 = new Employee(107, "Ad");  // 109
		
		
		
		Set<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		
		
	
		
		
		System.out.println(employeeSet.size());
		
		
	}
}
