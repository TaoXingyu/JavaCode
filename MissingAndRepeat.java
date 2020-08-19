package JavaCodePractice;


public class MissingAndRepeat {
	public static int[] findMissAndRepeatNums(int[] nums) {
        int res[]=new int[2];
  
        boolean map[]=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++)
            if(map[nums[i]]==false)
                map[nums[i]]=true;
            else
                res[0]=nums[i];
        for(int i=1;i<(nums.length+1);i++)
            if(map[i]==false){
                res[1]=i;
                break;
            }
        return res;
    }
	
public static void main(String[] args) {
    int a[]= {1,2,2,4};
    
    int b[] = findMissAndRepeatNums(a);
    
    for(int i:b) {
    	System.out.print(i);
    }
}

}

