package assgn4;

import java.util.Scanner;

public interface Num_Process {
	int cal(int a, int b);

	public static void main(String[] args) {
		Num_Process[] arr = new Num_Process[4];
		Scanner scanner = new Scanner(System.in);
		
		int a,b,choice;

		arr[0] = (x,y) -> (x+y);
		arr[1] = (x,y) -> (x-y);
		arr[2] = (x,y) -> (x*y);
		arr[3] = (x,y) -> (x/y);
		
		System.out.println("enter 1st number");
		a = scanner.nextInt();
		System.out.println("enter 2nd number");
		b = scanner.nextInt();
		System.out.println("enter choice");
		choice = scanner.nextInt();
		scanner.close();
		
		switch (choice) {
		case 1:
			System.out.println(arr[0].cal(a, b));
			break;
		case 2:
			System.out.println(arr[1].cal(a, b));
			break;
		case 3:
			System.out.println(arr[2].cal(a, b));
			break;
		case 4:
			System.out.println(arr[3].cal(a, b));
			break;
		default:
			System.out.println("enter valid choice");
			break;
		}
		
	}
		
}
