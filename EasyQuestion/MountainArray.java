public class MountainArray{
    public static void main(String[] args){
        int arr[] ={0,10,5,3};
        int res = peakElement(arr);
        System.out.println(res);
    }
    static int peakElement(int [] arr ){
        for(int i = 0;i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return i;
            }}
            return -1;
    }}
