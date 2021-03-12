package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee(101, "A");
		Employee e2 = new Employee(102, "B");
		Employee e3 = new Employee(103, "C");
		Employee e4 = new Employee(101, "A");

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		System.out.println(employeeList.contains(new Employee(101, "A")));
		System.out.println(employeeList.contains(e4));
		

	}
}
