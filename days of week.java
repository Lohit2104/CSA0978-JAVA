import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the day, month, and year
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Create a LocalDate object with the input date
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Convert the day of the week to a string
        String dayOfWeekString = dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();

        // Display the result
        System.out.println("Output: \"" + dayOfWeekString + "\"");
    }
}
