package com.innerclass;

public class MemberInnerClass {
	private int date = 30;

	public class InnerClass {
		public void msg() {
			System.out.println("Date: " + date);
		}

	}

	public static void main(String[] args) {
		MemberInnerClass object = new MemberInnerClass();
		MemberInnerClass.InnerClass in = object.new InnerClass();
		in.msg();
	}

}
