package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Dimension:");
	int rows = scanner.nextInt();
	int columns=scanner.nextInt();
	
	int a[][]=new int[rows][columns];
	int b[][]=new int[rows][columns];
	
	System.out.println("Enter Array a");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			a[i][j]=scanner.nextInt();
		}
	}
	System.out.println("Enter Array b");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			b[i][j]=scanner.nextInt();
		}
	}
	
	System.out.println("Result Array c is: ");
	int c[][]=new int[rows][columns];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					c[i][j]= a[i][j]+b[i][j];
				}
			}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
