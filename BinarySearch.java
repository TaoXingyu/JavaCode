package JavaCodePractice;

import java.lang.reflect.Array;

public class BinarySearch {
	public static int binarySearch(int arr[], int low, int high, int key)
	{
		int mid = (low + high)/2;
		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			}
			else if (arr[mid] == key) {
				return mid;
			}else {
				high = mid - 1;
			}
			mid = (low + high)/2;
		}
		if (low > high) {
			return -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10,18,19,20,25,28,48,55,62,70};
		int key = 48;
		int n = arr.length-1;
		int index = binarySearch(arr,0,n,key);
       
        System.out.println(key);
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("The Element at the index: "+index);

	}

}
