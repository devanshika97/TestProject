package practice;

import java.util.Scanner;

public class duplicateCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String words = scan.nextLine();
		int count=0;
		char[] chars=words.toCharArray();
		System.out.println("Duplicates Character are ");
		
		for(int i= 0; i<words.length();i++) {
			for(int j=i+1;j<words.length();j++) {
			if(chars[i]==chars[j]) {
				System.out.println(chars[j]);
				count++;
				break;
			}
				
			}
		
		}

	}

}
