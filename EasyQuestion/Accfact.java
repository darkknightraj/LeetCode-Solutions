import java.util.*;
public class Accfact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int res = fact(m)/fact(n);
        System.out.println(res);


    }
static int fact(int n){
    if (n == 0 || n == 1) {
            return 1;
    }
    else{

            return n*fact(n-1);
            }
}}
