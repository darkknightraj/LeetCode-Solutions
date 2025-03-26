import java.util.*;
public class ArmstrongNo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int digit = 0;
int temp = 0;
temp = n;
while (temp>0){
temp = temp/10;
digit ++;
}
System.out.println("no of digit" + digit);
int sum =0;
int arm = n;
while (n>0){
int rem = n%10;
sum = (int)(sum+Math.pow(rem,digit));
n=n/10;
}
if(arm==sum){
System.out.println("armstrong number");
}
else{
System.out.println("not armstrong number");
}

}
}
