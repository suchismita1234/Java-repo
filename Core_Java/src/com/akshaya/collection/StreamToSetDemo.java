package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamToSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> str=Stream.of("Akshaya","Kumar","Panda");
		
		/*Set<String> set=new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");*/
		System.out.println(str.count());
		Object[] list2 = str.toArray();
		System.out.println(list2[0]);
		
		/*String[] strArray= (String[]) set.toArray();
		System.out.println(strArray);*/
		
		/*String[] strArray= (String[]) str.toArray();
		System.out.println(strArray);*/
		//String[] strArray=str.toArray(String[] :: new);
	}

}
