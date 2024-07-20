package I18N;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(0, Locale.UK);
		System.out.println("Date in Uk Format:" + df.format(d));
		DateFormat DF = DateFormat.getDateInstance(0, Locale.US);
		System.out.println("Date in US Format:" + DF.format(d));

		DateFormat timeinstance = DateFormat.getTimeInstance();
		System.out.println(timeinstance.format(d));

		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);

		System.out.println(dateTimeInstance.format(d));
	}

}
