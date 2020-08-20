package JavaCodePractice;

public class ReverseArray {

	public static void main(String[] args) {
	
		// TODO 自动生成的方法存根
		String[] Array = { "a", "b", "c", "d", "e" };
		String[] b = reverseArray(Array);
		for (String i :b) {
		System.out.print(i);
		}
	}
	
	private static String[] reverseArray(String[] Array) {
		String[] new_array = new String[Array.length];
		for (int i = 0; i < Array.length; i++) {
			new_array[i] = Array[Array.length - i - 1];
		}
		return new_array;
	}

}
