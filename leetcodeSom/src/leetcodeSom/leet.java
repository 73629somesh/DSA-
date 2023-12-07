package leetcodeSom;

import java.util.Arrays;

public class leet {
	
	
	public static void removeEle(int[]nums,int val) {
		
		for(int i=0;i<nums.length;i++) {
			if(val==nums[i]) {
				nums[i]='_';
			}
		}
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				if(!(nums[i]=='_' && nums[j]=='_')) {
					 temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
	
		int[]nums= {3,2,2,3};
		int val=3;
		removeEle(nums,val);
		
	}

}
