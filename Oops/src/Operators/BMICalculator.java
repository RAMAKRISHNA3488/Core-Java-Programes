package Operators;

public class BMICalculator {

	public static void main(String[] args) {
      double height=5.6;
      double weight=170;
      double HeightInMeters=height*0.4536;
      double bmi=weight/(HeightInMeters *HeightInMeters);
      System.out.println("BMI"+bmi);
	}

}
