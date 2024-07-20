package com.medium;

import java.util.Calendar;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		System.gc();
		StringBuilder stringBuilder = new StringBuilder();
		long starttime1 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i <= 10000000; i++) {
			stringBuilder.append(i);
		}
		long endtime1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time take for 10000000 appends for StringBuilder: " + (endtime1 - starttime1) + "ms");

		System.gc();
		StringBuffer stringuffer = new StringBuffer();
		long starttime2 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i <= 10000000; i++) {
			stringuffer.append(i);
		}
		long endtime2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time take for 10000000 appends for StringBuffer: " + (endtime2 - starttime2) + "ms");

	}

}
