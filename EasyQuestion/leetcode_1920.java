//Build Array from Permutation
//https://leetcode.com/problems/build-array-from-permutation/description/
//Easy array question

import java.util.Arrays;

public class leetcode_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(arrpermutation(nums)));
    }
    static int[] arrpermutation(int[] nums){
        int [] result = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            result [i]=nums[nums[i]];
        }
        return result;
    }

}
