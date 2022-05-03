package com.genpact.day7;

import java.util.HashSet;

public class MyHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<>();
		hs.add("first");hs.add("second");hs.add("third");
		System.out.println(hs);
		
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("first");hs1.add("second");hs1.add("third");
		
		
		
		
		String[] strArr = new String[hs.size()];
		hs.toArray(strArr);
		System.out.println("copied Array");
		for(String str : strArr) {
			System.out.println(str);
		}

	}

}
