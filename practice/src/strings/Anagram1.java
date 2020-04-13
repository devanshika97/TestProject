package strings;

import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		System.out.println("Enter two word to check whether it is anagram or not.");
		Scanner scanner = new Scanner(System.in);
		String a=scanner.nextLine();
		String b = scanner.nextLine();

		boolean isAnagram = true;
		boolean visited[] = new boolean[b.length()];
		
	 int al[]=new int [256];
	 int bl[]=new int [256];
	 
	 for(char c:a.toCharArray()) {
		 int index = (int)c;
		 al[index]++;
	 }
	 for(char c:b.toCharArray()) {
		 int index = (int)c;
		 bl[index]++;
	 }
	 for (int i=0;i<256;i++) {
		 if(al[i]!=bl[i]) {
			 isAnagram=false;
			 break;
		 }
	 }
		
		
		if(isAnagram) {
			System.out.println("Its an Anagram");
				}
			else {
				System.out.println("Its not an Anagram");
					}

	}

}
