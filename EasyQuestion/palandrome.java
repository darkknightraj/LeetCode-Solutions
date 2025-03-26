import java.util.*;
public class palandrome{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num = 0;
int original_number = n;
while(n != 0){
int rem = n%10;
num = num*10+rem;
n=n/10;
}
if(original_number==num){
System.out.println("palanddrome number");
}else{
System.out.println("not palandrome number");
}
}}
