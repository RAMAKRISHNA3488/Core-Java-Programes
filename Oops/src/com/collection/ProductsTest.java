package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsTest {

	public static void main(String[] args) {

		List<Products> list = new ArrayList<Products>();
		list.add(new Products(1, "OnePlus", 56000));
		list.add(new Products(5, "Redmi", 20000));
		list.add(new Products(10, "IPhone", 60000));
		list.add(new Products(2, "ViVo", 25000));
		list.add(new Products(3, "Samsung", 25000));
		list.add(new Products(11, "Nokia", 30000));
		list.add(new Products(3, "Galacy", 50000));

		//list.stream().filter(e -> e.Prize > 59999).map(ee -> ee.Prize).forEach(System.out::println);

		list.stream().filter(e->e.getName().length()>5).map(ee->"Id: "+ee.getId()+" "+"Name: "+ee.getName()+" "+"Prizes: "+ee.getPrize()).forEach(System.out::println);
	}
}
