package assgn4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Int_Process_Arr {
	private int size;
	public Integer[] arr;
	Scanner scanner = new Scanner(System.in);

	public Int_Process_Arr() {
		this.size = 10;
		arr = new Integer[10];
	}

	public Int_Process_Arr(int size) {
		this.size = size;
		arr = new Integer[size];
	}

	public Int_Process_Arr(Int_Process_Arr numbers) {
		this.size = numbers.getSize();
		arr = new Integer[size];
		for (int i = 0; i < size; i++) {
			arr[i] = numbers.arr[i];
		}
	}

	public int getSize() {
		return size;
	}

	public void read() {
		System.out.println("enter " + size + " numbers");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
	}

	public void displayHorizontally() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public void displayVertically() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	public void sort() {
		Arrays.sort(arr);
	}

	public int maxElement() {
		return Collections.max(Arrays.asList(arr));

	}

	public int minElement() {
		return Collections.min(Arrays.asList(arr));

	}

	public int sum() {
		int sum = 0;

		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}

		return sum;

	}

	public int secondBiggest() {
		Int_Process_Arr t = this;
		t.sort();
		return t.arr[size - 2];
	}

}
