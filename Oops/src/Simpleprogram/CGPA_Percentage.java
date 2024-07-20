package Simpleprogram;

public class CGPA_Percentage {

	public static void main(String[] args) {
		double English = 9.0;
		double Telugu = 9.0;
		double Hindi = 8.0;
		double Maths = 9.0;
		double Science = 8.0;
		double SocialStudy = 9.0;
		double CGPA = (English + Hindi + Maths + Science + SocialStudy + Telugu) / (6.0);
		double CGPA_Percentage = 9.5 * (CGPA);
		System.out.println("CGPA Percentage is " + CGPA_Percentage);

	}

}
