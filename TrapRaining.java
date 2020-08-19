package JavaCodePractice;

public class TrapRaining {
	public static int trap(int[] height) {
		int res = 0;
		int l = 0;
		int r = height.length - 1;
		while (l<r) {
			int mn = Math.min(height[l],(height[r]));
			if (height[l]==mn) {
				++l;
				while (l<r && height[l]<mn) {
					res += mn - height[l++];
				}
			}
			else {
				--r;
				while (l<r && height[r]<mn) {
					res += mn - height[r--];
				}
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[] = {4,3,9,6,10};
		int b = trap(a);
		
			System.out.print(b);
		
		

	}

}
