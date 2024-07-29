//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1337111911/
import java.util.Scanner;

public class leetcode1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int result = findNumbers(num);
        System.out.println("Number of elements with an even number of digits: " + result);
        
        sc.close();
    }

    static int findNumbers(int[] num) {
        int count = 0;
        for (int n : num) {
            if (even(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int no_of_digits = digits(num);
        return no_of_digits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
