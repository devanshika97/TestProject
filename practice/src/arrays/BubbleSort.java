package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to sort?\n Enter");
		int number =scanner.nextInt();
		int a[]= new int[number];
		for (int i=0;i<number;i++) {
			a[i]=scanner.nextInt();
		}
		int n= a.length;
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			for (int j=0;j<n-1;j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted= false;
				}
				
			}
			if(sorted) break;
		}
		for(int item: a) {
			System.out.print(item+" ");
		}
	}

}
