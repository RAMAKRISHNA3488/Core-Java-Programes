package I18N;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public void method1() {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(0, Locale.CANADA);
		System.out.println(df.format(d));

		DateFormat k = DateFormat.getDateInstance(0, Locale.CHINA);
		System.out.println(k.format(d));

		DateFormat i = DateFormat.getDateInstance(0, Locale.JAPAN);
		System.out.println(i.format(d));
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println(df1.format(d));

	}

	public static void main(String[] args) {
		DateDemo dd = new DateDemo();
		dd.method1();

	}

}
