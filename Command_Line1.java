package com.sapient;

import java.util.Scanner;

public class Command_Line1 {
	private int n, sum = 0, biggest = 0, smallest = 0;
	private double avg = 0.0;
	private int arr[];
	Scanner read = new Scanner(System.in);

	public void setData() {
		System.out.println("Enter n");
		n = read.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number");
			arr[i] = read.nextInt();
		}
	}

	public void calData() {
		for (int i = 0; i < n; i++)
			sum += arr[i];
		avg = (double) sum / n;
		smallest = arr[0];
		for (int i = 1; i < n; i++)
			if (smallest > arr[i])
				smallest = arr[i];
		biggest = arr[0];
		for (int i = 0; i < n; i++)
			if (biggest < arr[i])
				biggest = arr[i];
	}

	public void displayData() {
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
		System.out.println("smallest:" + smallest);
		System.out.println("biggest" + biggest);
	}
}
