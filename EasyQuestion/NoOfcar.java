import java.util.*;
public class NoOfcar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        int nofbike = (4*v-w)/2;
        int noofcar=v-nofbike;
        System.out.println("no of bike "+ nofbike);
        System.out.println("NO of car -- "+ noofcar);
        sc.close();
    }

}
