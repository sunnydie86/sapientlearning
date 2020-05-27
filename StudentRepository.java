package assgn5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentRepository {
	List<Student> arr = new ArrayList<>();

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

		Student s = new Student(id, name, city);

		// scanner.close();
		arr.add(s);
	}

	public void display() {
		arr.forEach(System.out::println);
	}

	public void displayAllCity(String city) {
		arr.stream().filter(s -> s.getCity().equals(city)).forEach(System.out::println);
	}

	public void displaySortedName() {
		Comparator<Student> studentComparator = (s1, s2) -> (s1.getName().compareTo(s2.getName()));
		arr.stream().
				sorted(studentComparator).forEach(System.out::println);
	}

	public void displaySortedCity() {
		Comparator<Student> studentComparator = (s1, s2) -> (s1.getCity().compareTo(s2.getCity()));
		arr.stream().sorted(studentComparator).forEach(System.out::println);
	}

	public void displayById(int id) {
		List<Student> res = arr.stream().filter(a -> a.getId() == id).collect(Collectors.toList());
		if (res.isEmpty())
			System.out.println("no student found");
		else
			System.out.println(res);
	}

	public void close() {
		scanner.close();
	}

	public static void main(String args[]) {
		StudentRepository sr = new StudentRepository();
		sr.read();
		sr.read();
		sr.read();
		sr.display();
		sr.displayAllCity("hy");
		sr.displaySortedName();
		sr.displaySortedCity();
		sr.displayById(2);
		sr.close();
		
	}
}
