import java.util.*;
public class leetcode442{

    public static void main(String[] args){
       
         int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = duplicates(nums);
        System.out.println(duplicates);
        int add = sum(duplicates);
        System.out.println(add);
    }

static int sum(List<Integer> duplicates){
    int sum = 0;
    for(int i = 0;i< duplicates.size();i++){
        sum += duplicates.get(i);
    }
    return sum;
}
static List<Integer> duplicates(int[] nums){
    int i = 0;
    while(i< nums.length){
        int correct = nums[i]-1;
        if(nums[i] !=nums[correct]){
            swap(nums, i , correct);
        }
        else{
            i++;
        }}
     List<Integer> ans = new ArrayList<>();
     for(int index =0;index<nums.length;index++){
         if(nums[index] != index+1){

         ans.add(nums[index]);
        
     }}

     return ans;
}


static void swap(int [] nums, int first ,int second){
    int temp = nums[first];
     nums[first] = nums[second];
     nums[second] = temp;
}
}
