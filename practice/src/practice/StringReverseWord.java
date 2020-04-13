package practice;

import java.util.Scanner;

class Solution{
	public String reverseWords(String s) {
		int i = s.length()-1;
		String ans="";
		while (i>=0) {
			while(i>=0&&s.charAt(i)==' ')i--; 
			int j=i;
			if(i<0)break;
			while(i>=0&&s.charAt(i)!=' ')i--;
			if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1,j+1));
			}
			else {
				ans=ans.concat(" "+s.substring(i+1,j+1));
			}
			
		}
		return ans;
		
	}
}
public class StringReverseWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		System.out.println("Before Reversing:"+sentence);
		Solution solution = new Solution();
		System.out.println(solution.reverseWords(sentence));

	}

}
