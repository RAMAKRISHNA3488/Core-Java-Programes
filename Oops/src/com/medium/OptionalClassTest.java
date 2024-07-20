package com.medium;

public class OptionalClassTest {

	public static void main(String[] args) {
		OptionalClass oc = new OptionalClass("Ram", 21, "govrnament job");
		String UppercaseName = "";
		if (oc != null) {
			String name = oc.getName();
			String job = oc.getJob();
			if (name != null) {
				UppercaseName = name.toUpperCase();
			}
			if(job!=null) {
				UppercaseName=job.toUpperCase();
			}
		}
		System.out.println(UppercaseName);
	}
}
