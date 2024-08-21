import java.util.*;

public class leetcode448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        leetcode448 solution = new leetcode448();  // Create an instance of the class
        List<Integer> res = solution.findDisappearedNumbers(nums);  // Call the non-static method
        System.out.println(res);
    }

    // Method to find disappeared numbers
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Check if nums[i] is within the correct range and not already in the correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // Check for indices where the number is not the expected number
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    // Method to swap elements in the array
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}






