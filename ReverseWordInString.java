package JavaCodePractice;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "Hello World, this is Java.";
		 System.out.println(s);
		String newString = reverse(s);
		System.out.println(newString);
	}
		
		private static String reverse(String s) {
			String[] strs = s.split(" "); //Split the original string with Spaces
			int n = strs.length;
			for (int i = 0; i < n/2; i++) {
				String temp = strs[i];
				strs[i] = strs[n-i-1];
				strs[n-i-1] = temp;
			}
			//Converts an array of strings to a string
			StringBuffer newString = new StringBuffer();
			for(int i = 0; i<n-1; i++) {
				newString.append(strs[i]+" ");
			}
			newString.append(strs[n-1]);
			return newString.toString();
		}
		

}
