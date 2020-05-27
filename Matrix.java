package assgn4;

import java.util.Scanner;

public class Matrix {
	private int nRows, nCols;
	public int[][] mat;

	Scanner scanner = new Scanner(System.in);

	public Matrix() {
		this(3, 3);
	}

	public Matrix(int rows, int cols) {
		this.nRows = rows;
		this.nCols = cols;
		mat = new int[rows][cols];

		for (int j = 0; j < nRows; j++) {
			mat[j] = new int[nCols];
		}
	}

	public Matrix(Matrix m) {
		this.nRows = m.getNRows();
		this.nCols = m.getNCols();
		mat = new int[nRows][nCols];

		for (int j = 0; j < nRows; j++) {
			mat[j] = new int[nCols];
		}

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				mat[i][j] = m.mat[i][j];
			}
		}
	}

	public int getNRows() {
		return nRows;
	}

	public int getNCols() {
		return nCols;
	}

	public void read() {
		for (int i = 0; i < nRows; i++) {
			System.out.println("enter " + i + " row");
			for (int j = 0; j < nCols; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
	}

	public void display() {
		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix m) {
		Matrix sum = new Matrix(nRows, nCols);

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nCols; j++) {
				sum.mat[i][j] = m.mat[i][j] + mat[i][j];
			}
		}

		return sum;

	}

	public boolean isScalar() {
		int n = Integer.min(nRows, nCols);
		int val = this.mat[0][0];
		for (int i = 1; i < n; i++) {
			if (mat[i][i] != val)
				return false;
		}

		return true;
	}

	public Matrix multiply(Matrix m) {
		Matrix sum = new Matrix(nRows, m.getNCols());

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < m.getNCols(); j++) {
				int val = 0;
				for (int k = 0; k < nCols; k++)
					val += mat[i][k] * m.mat[k][j];
				sum.mat[i][j] = val;
			}
		}

		return sum;

	}

}
