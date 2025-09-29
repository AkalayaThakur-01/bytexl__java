import java.util.ArrayList;
import java.util.Scanner;

public class AutoboxingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");

        for (String token : tokens) {
            try {
                Integer num = Integer.parseInt(token); 
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input skipped: " + token);
            }
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }

        System.out.println("The sum of integers is: " + sum);
    }
}
