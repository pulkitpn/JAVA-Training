package com.genpact.day1;

import java.util.ArrayList;
import java.util.Iterator;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        list.add("tyu");
        System.out.println("while loop start here ");
        Iterator<String > it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        for(int i=0 ; i<list.size();i++) {
            System.out.println(list.get(i));
        }

	}

}
