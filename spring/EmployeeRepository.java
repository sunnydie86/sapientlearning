package springassgn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeRepository {
	List<Employee> arr = new ArrayList<Employee>();

	Scanner scanner = new Scanner(System.in);

	public void read() {
		int id;
		String name, city;

		System.out.println("enter id");
		id = scanner.nextInt();

		System.out.println("enter name");
		name = scanner.next();

		System.out.println("enter city");
		city = scanner.next();

		Employee s = new Employee(id, name, city);

		// scanner.close();
		arr.add(s);
	}


	public void displayById(int id) {
		for (Employee emp : arr) {
			if (emp.getId() == id) {
				System.out.println(emp);
				break;
			}
		}
	}

	public void close() {
		scanner.close();
	}

}