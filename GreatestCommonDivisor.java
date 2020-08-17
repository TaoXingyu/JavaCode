package JavaCodePractice;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(getNumber(100,80));
	}
	private static int getNumber(int x, int y) {
		 
        int big=x>y?x:y;
        int small=x<y?x:y;
        if (big%small==0){
            return small;
        }
        return getNumber(big%small,small);
    }
}
