package practice;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int num,a=0,b=0,c=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num = scanner.nextInt();
		System.out.println("fibonaci Series of the number is:");
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" , ");
		}

	}

}
