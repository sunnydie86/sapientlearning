package com.sapient.shapes;

public class Shapes {
	public int noOfSides;

	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.calculateShapeArea(3, 12);
		shape.calculateShapeArea(4, 15);
		shape.calculateShapeArea(5, 15);
	}

	private void calculateShapeArea(int numberOfSides, int sideLength) {
		switch (numberOfSides) {
		case 1:
			Circle.calculateArea(sideLength);
			break;
		case 3:
			Triangle.calculateArea(sideLength);
			break;
		case 4:
			Square.calculateArea(sideLength);
			break;
		default:
			System.out.println("No Shapes Present");
			break;
		}
	}
}
