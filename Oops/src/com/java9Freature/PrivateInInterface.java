package com.java9Freature;

public interface PrivateInInterface {

	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending Multiple Notifications");
	}
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending a Notification");
	}

	private void establishConnection() {
		System.out.println("Establishing a Connection");
	}
}

