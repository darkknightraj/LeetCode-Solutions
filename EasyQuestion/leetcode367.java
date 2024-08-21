import java.util.*;
public class leetcode367{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = search(num);
        System.out.println(res);
    }

    static boolean search(int num){
        int start = 0;
        int end = num;
        while(start<=end ){
            
            int mid = start+ (end- start)/2;
            long square = (long)mid*mid;
            
            if(num>square){
                start = mid+1;
            }
            else if(num < square){
                end = mid-1;

            }
            else{
                return true;
            }
}
            return false;
    }
}
