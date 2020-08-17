package JavaCodePractice;

public class Palindrome {
public static void checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
