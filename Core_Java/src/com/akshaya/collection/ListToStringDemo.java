package com.akshaya.collection;

import java.util.ArrayList;
import java.util.List;

public class ListToStringDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		StringBuilder sb=new StringBuilder();
		list.add("Akshaya");
		list.add("Ajit");
		list.add("Ashok");
		System.out.println(list);
		for(String str:list){
			sb.append(str);
			sb.append(" ");
		}
		System.out.println(sb);

	}

}
