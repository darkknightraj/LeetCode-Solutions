import java.util.Scanner;

public class PolicevsChor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 13; // Number of caves

        System.out.print("Enter the initial position of the thief (0 to " + (n-1) + "): ");
        int thief_index = scanner.nextInt();

        // Ensure the input is within valid range
        if(thief_index < 0 || thief_index >= n) {
            System.out.println("Invalid position! Please run the program again with a valid position.");
            return;
        }

        int days = searchThief(n, thief_index);
        System.out.println("The thief was caught after " + days + " days.");
    }

    static int searchThief(int n, int thief_index) {
        int day = 0;
        int police_index1 = 0;     
        int police_index2 = n - 1; 
        while (true) {
           if (thief_index == police_index1 || thief_index == police_index2) {
                return day;
            }

            // Update positions for the next day
            thief_index = (thief_index + 1) % n;
            police_index1 = (police_index1 + 1) % n;
            police_index2 = (police_index2 - 1 + n) % n;
            day++;
        }
    }
}

