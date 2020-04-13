package practice;
public class demo0{
	public static void main(String[] args) {
		int count=0;
		String str = "mahalayama";
		char chars[]=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
			if(chars[i]=='a') {
				count++;
			
	
			}			
		}
		
		System.out.print(count);
	}
}