package com.medium;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		// Add key-values to the Hashmap
		hashMap.put("Apple", 20);
		hashMap.put("Orange", 10);
		hashMap.put("Banana", 50);
		// retrieve a values from the HashMap
		int value = hashMap.get("Banana");
		System.out.println("The Value of 'Banana' is: " + value);
		// check if a key in the Hashmap
		boolean containsKey = hashMap.containsKey("Apple");
		System.out.println("the Hashmap contains the key 'Apple' is: " + containsKey);
		boolean containsValue = hashMap.containsValue(10);
		System.out.println("the Hashmap contains the value '30' is: " + containsValue);
		// removing key-values pair in the Hashmap
		hashMap.remove("Orange");
		System.out.println("After Removing 'Orange' the Hashmap contains " + hashMap.size() + " Key-values pairs");

		// iterating over the key-values pair
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			Integer values = entry.getValue();
			System.out.println(key + "=" + values);
		}

	}

}
