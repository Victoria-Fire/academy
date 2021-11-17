package by.academy.homework.hw3.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateApp {


	public DateApp() {
		super();

	}

	public boolean checkDate(String checkDate) {
		Pattern pattern = Pattern.compile(
				"^(?:(?:31(\\/|-)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-)(?:0?[13-9]|1[0-2])\\2))"
				+ "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]"
				+ "|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])"
				+ "(\\/|-)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
		Matcher matcher = pattern.matcher(checkDate);

		return matcher.matches();
	}
	
	public void parseDate(String parseDate) throws ParseException {
	
		Pattern pattern = Pattern.compile("^\\d{2}\\/\\d{2}\\/\\d{4}$");
		Matcher matcher = pattern.matcher(parseDate);
		
		if (matcher.matches() == true) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse(parseDate);
			Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			calendar.setTime(date);
			System.out.println("День: <" + calendar.get(Calendar.DAY_OF_MONTH) + ">");
			System.out.println("Месяц: <" + (calendar.get(Calendar.MONTH) + 1) + ">");
			System.out.println("Год: <" + (calendar.get(Calendar.YEAR)) + ">");
		} else {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date date = format.parse(parseDate);
			Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
			calendar.setTime(date);
			System.out.println("День: <" + calendar.get(Calendar.DAY_OF_MONTH) + ">");
			System.out.println("Месяц: <" + (calendar.get(Calendar.MONTH) + 1) + ">");
			System.out.println("Год: <" + (calendar.get(Calendar.YEAR)) + ">");
		}
		
	}

}
