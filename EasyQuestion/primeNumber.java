import java.util.*;
public class primeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean IsPrime = true;
		if(n<2){
			System.out.println("not prime");
		}
		int c =2;
		while(c*c<=n){
			if(n%c==0){
				IsPrime=false;
				break;
			}
			c++;
		}
			if(IsPrime){
				System.out.println("prime Number");
			}
			else{
				System.out.println("not prime number");
			}
		
	
	}}
