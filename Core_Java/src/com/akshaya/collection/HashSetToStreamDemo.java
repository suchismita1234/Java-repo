//Date:2ndApril2018
package com.akshaya.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetToStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("Akshaya");
		set.add("Kumar");
		set.add("Panda");
		set.stream().forEach(name->System.out.println(name+" "));
	}
}
