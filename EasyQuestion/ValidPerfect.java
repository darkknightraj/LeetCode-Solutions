import java.util.*;
public class ValidPerfect{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean  res = perfect(num);
        System.out.println(res);
    }
    static boolean perfect(int num){
        if(num == 1){
            return true;
        }
        for(int i= 0; i<=num/2;i++){
            if(num== i*i){
               i++;
                return true;
              }
        }
        return false;
    }
}
