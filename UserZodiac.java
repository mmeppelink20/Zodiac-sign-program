import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class UserZodiac {
	public static void main(String[] args) {
		ZodiacSign test = new ZodiacSign();
		Scanner scnr = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");


		
		while(true) {
			try {
				System.out.print("Enter your birthday (ex: January 1): \n");
				String birthday = scnr.nextLine() + ", 2000";
				LocalDate yourBirthday = LocalDate.parse(birthday, formatter);
				
				test.whatIsYourZodiacSign(formatter, yourBirthday);
				
				break;
			} catch (DateTimeParseException e) {
				System.out.println("invalid date.\n");
			}
		}

		scnr.close();
	}
}
