import java.util.*;
public class leetcode1929{
    public static void main(String[] args){
        int [] num = {1,2,3,4,3};
        int [] res =getConcatation(num);
        System.out.println(Arrays.toString(res));
    }
    static int [] getConcatation(int [] num){
        int n = num.length;
        int [] ans = new int[2*n];
        for (int i = 0; i<n;i++){
            ans[i]=num[i];
            ans[i+n]=num[i];
        }
        return ans;
    }}
