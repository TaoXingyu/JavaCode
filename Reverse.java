package JavaCodePractice;

public class Reverse {
	 public static String reverse(String str) {
		    char[] chars = str.toCharArray();
		    String reverse = "";
		    for (int i = chars.length - 1; i >= 0; i--) {
		      reverse += chars[i];
		    }
		    return reverse;
		  }
}
