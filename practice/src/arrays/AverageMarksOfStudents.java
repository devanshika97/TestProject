package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number of Student:");
		int number = scanner.nextInt();
		int marks[]=new int[number];
		System.out.println("Enter the Marks now");
		for(int i=0;i<number;i++) {
			marks[i]=scanner.nextInt();
		}
		int averageMarks=0;
		for (int i=0;i<number;i++) {
			averageMarks=averageMarks+marks[i];
		}
		averageMarks = averageMarks/number;
		System.out.println("The average Marks are "+averageMarks);
	}

}
