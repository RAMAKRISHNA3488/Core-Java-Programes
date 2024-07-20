package I18N;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry() + " " + l.getLanguage());

		System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
		String[] isoCountries = Locale.getISOCountries();
		for (String EachContries : isoCountries) {
			System.out.println(EachContries);

			String[] isoLanguages = Locale.getISOLanguages();
			for (String EachLanguages : isoLanguages) {
				System.out.println(EachLanguages);
			}
		}

	}

}
