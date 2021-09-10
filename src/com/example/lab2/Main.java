package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		
		System.out.println("Fruit List (ordered by name)");
		
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Orange", 1500));
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Banana", 2500));
		fl.add(new Fruit(105, "Grapefruit", 5000));
		fl.add(new Fruit(106, "Mango", 7000));
		fl.add(new Fruit(107, "Durian", 10000));
		fl.add(new Fruit(108, "Melon", 8000));
		fl.add(new Fruit(109, "Peach", 4000));
		fl.add(new Fruit(110, "Lemon", 2000));
		
		Collections.sort(fl, new FruitComparator());
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
 