import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
    int [] arr = {2,4,5,3,8,6};
   
    System.out.println(Arrays.toString(selection(arr)));

    }
static int[] selection(int[] arr){
    
    for(int i = 0; i<arr.length;i++){
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
    
    }
    return arr;
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int [] arr, int start, int end ){
        int max = start;
        for (int i = start;i<=end;i++){
            if(arr[max]< arr[i]){
                max = i;
            }}
            return max;
    }}
