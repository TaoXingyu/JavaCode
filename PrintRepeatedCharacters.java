package JavaCodePractice;

import java.util.ArrayList;
import java.util.List;

public class PrintRepeatedCharacters {
	public static void main(String[] args) {
		String word="aabbccd";
		 char[] ch1 = word.toCharArray();
	        List<Character> list = new ArrayList<>();

	        for(char ch : ch1) {
	            if (list.contains(ch)) {
	                System.out.println(ch);
	                list.clear();
	            }
	            list.add(ch);
	            //System.out.println(ch);            
	        }
	}
}
