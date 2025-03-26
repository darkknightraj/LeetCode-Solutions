public class PeakElement{
   public static void main(String[] args){
   int [] arr = {0,2,1,0};
   int res= peak(arr);
   System.out.println(res);
}
static int peak(int [] arr){
    int start =0;
    int end = arr.length-1;
  
    while(start<end){
      int  mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end = mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                return -1;
            }
}
return start;
}
}
