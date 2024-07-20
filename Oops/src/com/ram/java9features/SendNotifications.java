package com.ram.java9features;


public interface  SendNotifications {
	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple Notification");
		
	}
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending  Notification");
		
	}
	private void establishConnection() {
		System.out.println("Establishing a connection");
	}

}
