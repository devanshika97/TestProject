package practice;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two number which you want to swap");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("before swapping a="+a+"and b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a="+a+"and b="+b);

	}

}
