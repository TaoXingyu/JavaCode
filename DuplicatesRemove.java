package JavaCodePractice;

public class DuplicatesRemove {
	 public static int unique1(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }
	        int[] tmpNums = new int[nums.length];
	        tmpNums[0] = nums[0];
	        int index = 1;
	        for (int i = 1, len = nums.length; i < len; i++) {
	            int j = 0;
	            for (; j < index; j++) {
	                if (tmpNums[j] == nums[i]) {
	                    break;
	                }
	            }
	            if (j == index) {
	                tmpNums[index++] = nums[i];
	            }
	        }
	        nums = tmpNums;
	        return index;
	    }
}
