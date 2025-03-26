import java.util.*;
public class geoodd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res;
		if(n%2==1){
			int k=(n/2);
			res =(int)(Math.pow(2,k));
		}
		else{
			
	      int k =(n/2)-1;
			res=(int)(Math.pow(3,k));
		}
		System.out.println(res);
	}
}
