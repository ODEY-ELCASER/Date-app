import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class skdl {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Simple Date App");
		System.out.println("Today: " + today);

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a date (YYYY-MM-DD): ");
			String input = scanner.nextLine().trim();

			try {
				LocalDate date = LocalDate.parse(input);
				long days = ChronoUnit.DAYS.between(today, date);
				if (days == 0) {
					System.out.println("That date is today.");
				} else if (days > 0) {
					System.out.println("That date is " + days + " day(s) from today.");
				} else {
					System.out.println("That date was " + Math.abs(days) + " day(s) ago.");
				}
			} catch (DateTimeParseException e) {
				System.out.println("Invalid date. Please use YYYY-MM-DD.");// odey elcaser bir tane
			}
		}
	}
}
