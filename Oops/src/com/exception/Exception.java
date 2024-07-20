package com.exception;

public class Exception {

	public static void main(String[] args) throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}
