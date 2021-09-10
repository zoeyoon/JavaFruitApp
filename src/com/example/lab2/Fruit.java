package com.example.lab2;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit(int n1, String str, int n2) {
		this.no = n1;
		this.name = str;
		this.price = n2;
	}
	
	public String toString() {
		return "Fruit [no="+no+", name="+name+", price="+price+"]";
	}
}

class FruitComparator implements Comparator<Fruit>{
	public int compare(Fruit o1, Fruit o2){
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	public int compare(Fruit o1, Fruit o2){
		return o2.name.compareTo(o1.name);
	}
}
