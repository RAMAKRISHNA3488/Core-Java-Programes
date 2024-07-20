package com.medium;

public class OptionalClass {
	private final String name;
	private final Integer age;
	private final String job;

	public OptionalClass(String name, Integer age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

}
