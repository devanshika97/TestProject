package strings;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
	System.out.println("Enter two word to check whether it is anagram or not.");
	Scanner scanner = new Scanner(System.in);
	String a=scanner.nextLine();
	String b = scanner.nextLine();

	boolean isAnagram = false;
	boolean visited[] = new boolean[b.length()];
	if(a.length()==b.length()) {
		
	for(int i=0;i<a.length();i++) {
		char c=a.charAt(i);
		 isAnagram = false;
		for(int j=0;j<b.length();j++) {
			 if(b.charAt(j)==c && !visited[j]) {
				 visited[j]=true;
				 isAnagram =true;
				 break;
			 }
			}
		if(!isAnagram) {
			break;
			}
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
