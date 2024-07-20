package Simpleprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HCLTech {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("India", "USA", "Canada", "Japan", "France", "Italy", "Germany");
		String s = list.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(s);

		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum = list1.stream().reduce(0, Integer::sum);
		 List<Integer> l =  list1.stream().map(e->e+sum).collect(Collectors.toList());
		 System.out.println(l);
	}

}
