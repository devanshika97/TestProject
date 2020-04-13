package arrays;

import java.util.Scanner;

public class SelectionSort {
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
				int minInd =i;
				
				for(int j=i;j<n;j++) {
					if(a[j]<a[minInd]) {
						minInd= j;
						}
					
					}
				int temp=a[i];
				a[i]=a[minInd];
				a[minInd]=temp;
				
				}
			for(int item:a) {
				System.out.print(item+" ");
			}
			}
		}
	


