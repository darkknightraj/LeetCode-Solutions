import java.util.*;
public class leetcode287{
public static void main(String[] args){
int [] arr = {3,1,3,4,2};
int  res = sort(arr);
System.out.println(res);

}
static int sort(int [] arr){
    int i =0;
    while(i< arr.length){
        int correct = arr[i]-1;
        if(arr[i] != arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
        }
       return  arr[ arr.length-1];


}
static void swap(int[] arr, int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

}

}
