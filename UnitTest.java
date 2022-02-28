import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UnitTest {
	public static void main(String[] args) {
		ZodiacSign test = new ZodiacSign();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

		//aries
		LocalDate yourBirthday = LocalDate.parse("March 21, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//taurus
		yourBirthday = LocalDate.parse("April 25, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//gemini
		yourBirthday = LocalDate.parse("May 27, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//cancer
		yourBirthday = LocalDate.parse("June 25, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//leo
		yourBirthday = LocalDate.parse("July 27, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//virgo
		yourBirthday = LocalDate.parse("September 5, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//libra
		yourBirthday = LocalDate.parse("October 9, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//scorpio
		yourBirthday = LocalDate.parse("October 25, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//sagittarius
		yourBirthday = LocalDate.parse("November 25, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);
		
		//capricorn
		yourBirthday = LocalDate.parse("January 9, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);		
		
		//aquarius
		yourBirthday = LocalDate.parse("February 15, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);		

		//Pisces
		yourBirthday = LocalDate.parse("March 15, 2000", formatter);
		test.whatIsYourZodiacSign(formatter, yourBirthday);		
		
	}
}
