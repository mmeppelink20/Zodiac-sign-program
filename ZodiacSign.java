import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// determines the zodiac sign for an input birth date
public class ZodiacSign {

	public static void whatIsYourZodiacSign(DateTimeFormatter formatter, LocalDate yourBirthday ) {

			LocalDate ariesStart = LocalDate.parse("March 20, 2000", formatter);
			LocalDate ariesEnd = LocalDate.parse("April 20, 2000", formatter);

			// aries
			if (yourBirthday.isBefore(ariesEnd) && yourBirthday.isAfter(ariesStart)) {
				System.out.println("You are an Aries");

			}

			LocalDate taurusStart = LocalDate.parse("April 19, 2000", formatter);
			LocalDate taurusEnd = LocalDate.parse("May 21, 2000", formatter);
			// taurus
			if (yourBirthday.isBefore(taurusEnd) && yourBirthday.isAfter(taurusStart)) {
				System.out.println("You are a Taurus");
			}

			LocalDate geminiStart = LocalDate.parse("May 20, 2000", formatter);
			LocalDate geminiEnd = LocalDate.parse("June 21, 2000", formatter);
			// gemini
			if (yourBirthday.isBefore(geminiEnd) && yourBirthday.isAfter(geminiStart)) {
				System.out.println("You are a Gemini");
			}

			LocalDate cancerStart = LocalDate.parse("June 20, 2000", formatter);
			LocalDate cancerEnd = LocalDate.parse("July 23, 2000", formatter);

			// cancer
			if (yourBirthday.isBefore(cancerEnd) && yourBirthday.isAfter(cancerStart)) {
				System.out.println("You are a Cancer");
			}

			LocalDate leoStart = LocalDate.parse("July 22, 2000", formatter);
			LocalDate leoEnd = LocalDate.parse("August 23, 2000", formatter);
			// leo
			if (yourBirthday.isBefore(leoEnd) && yourBirthday.isAfter(leoStart)) {
				System.out.println("You are a Leo");
			}

			LocalDate virgoStart = LocalDate.parse("August 22, 2000", formatter);
			LocalDate virgoEnd = LocalDate.parse("September 23, 2000", formatter);
			// virgo
			if (yourBirthday.isBefore(virgoEnd) && yourBirthday.isAfter(virgoStart)) {
				System.out.println("You are a Virgo");
			}

			LocalDate libraStart = LocalDate.parse("September 22, 2000", formatter);
			LocalDate libraEnd = LocalDate.parse("October 23, 2000", formatter);
			// libra
			if (yourBirthday.isBefore(libraEnd) && yourBirthday.isAfter(libraStart)) {
				System.out.println("You are a Libra");
			}

			LocalDate scorpioStart = LocalDate.parse("October 22, 2000", formatter);
			LocalDate scorpioEnd = LocalDate.parse("November 22, 2000", formatter);
			// scorpio
			if (yourBirthday.isBefore(scorpioEnd) && yourBirthday.isAfter(scorpioStart)) {
				System.out.println("You are a Scorpio");
			}

			LocalDate sagittariusStart = LocalDate.parse("November 21, 2000", formatter);
			LocalDate sagittariusEnd = LocalDate.parse("December 22, 2000", formatter);
			// Sagittarius
			if (yourBirthday.isBefore(sagittariusEnd) && yourBirthday.isAfter(sagittariusStart)) {
				System.out.println("You are a Sagittarius");
			}

			LocalDate capricornStart = LocalDate.parse("December 21, 2000", formatter);
			LocalDate capricornEnd = LocalDate.parse("January 20, 2000", formatter);

			// capricorn
			if (yourBirthday.isBefore(capricornEnd) || yourBirthday.isAfter(capricornStart)) {
				System.out.println("You are a Capricorn");
			}

			LocalDate aquariusStart = LocalDate.parse("January 19, 2000", formatter);
			LocalDate aquariusEnd = LocalDate.parse("February 19, 2000", formatter);
			// Aquarius
			if (yourBirthday.isBefore(aquariusEnd) && yourBirthday.isAfter(aquariusStart)) {
				System.out.println("You are an Aquarius");
			}

			LocalDate piscesStart = LocalDate.parse("February 18, 2000", formatter);
			LocalDate piscesEnd = LocalDate.parse("March 21, 2000", formatter);
			// pisces
			if (yourBirthday.isBefore(piscesEnd) && yourBirthday.isAfter(piscesStart)) {
				System.out.println("You are a Pisces");
			}

	}
}
