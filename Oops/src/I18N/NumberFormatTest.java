package I18N;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {

		Double d = 12364578.265;
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(nf.format(d));
		NumberFormat UK = NumberFormat.getInstance(Locale.UK);
		System.out.println(UK.format(d));
		NumberFormat US = NumberFormat.getInstance(Locale.US);
		System.out.println(US.format(d));
	}

}
