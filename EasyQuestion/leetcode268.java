import java.util.*;
public class leetcode268{
    public static void main(String[] args){
      int [] nums = {0,3,4,2,1,6};
     System.out.println(missingnumber(nums));
     }
  static int missingnumber(int[] nums){
      int n = nums.length;
      int ans= 0;
      for(int i =0;i<n;i++){
          ans = ans^i;
      }
      for(int i = 0;i<nums.length;i++){
          ans = ans^nums[i];
      }
      return ans;
  }
  }
