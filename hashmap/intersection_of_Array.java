package hash;
import java.util.*;
public class intersection_of_Array {
public static void main(String[] args) {
	int[] arr1 = {3,5,7,5,2,6,1,7};
	int[] arr2 = {2,7,3,5,9,18,6,7};
	InterSectionofArray(arr2,arr1);
	
}
public  static void InterSectionofArray(int[]arr,int[]arr1) {
	HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
	for(int i=0;i<arr1.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i],map.get(arr[i])+1);
		}
		else {
			map.put(arr[i], 1);
		}
	}
	ArrayList<Integer> ans =new ArrayList<Integer>();
	for(int i=0;i<arr1.length;i++) {
		if(map.containsKey(arr[i])&& map.get(arr[i])!=0) {
			ans.add(arr[i]);
			map.put(arr[i], map.get(arr[i])-1);
		}
	}
	System.out.println(ans);
}
}
