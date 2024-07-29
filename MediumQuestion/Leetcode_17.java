//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
//17. Letter Combinations of a Phone Number
import java.util.*;

class Solution {
    private void BackTracking(int index, StringBuilder text, String digits, Map<Character, String> mp, List<String> res) {
        if (index == digits.length()) {
            res.add(text.toString());
            return;
        }
        
        String letters = mp.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            text.append(letters.charAt(i));
            BackTracking(index + 1, text, digits, mp, res);
            text.deleteCharAt(text.length() - 1); // Remove last character to backtrack properly
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        
        Map<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        
        BackTracking(0, new StringBuilder(), digits, mp, res);
        return res;
    }
}

public class Leetcode_17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        //String digits = "23"; // Example input
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations);
        sc.close();
    }
}
