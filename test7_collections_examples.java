package com.philips.rs.performancebridge.test.stepdefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class test7_collections_examples {

	// Collections examples
	public static void main(String[] args) {

		ArrayList<String> arList = new ArrayList<String>();
		arList.add("s1");
		arList.add("s1");
		arList.add("s1");
		System.out.println("print arrayList " + arList);

		HashSet<String> hs = new HashSet<String>();
		hs.addAll((arList));
		System.out.println("print hashset " + hs);

		Map<Object, Object> m = new HashMap<>();
		m.put(1, "s");
		m.put(1, "ss");
		m.put(3, "s");

		@SuppressWarnings("unused")
		HashSet<Integer> hss = new HashSet<Integer>();
		System.out.println("print map " + m.get(1));

		ArrayList<Integer> arListInt = new ArrayList<Integer>();
		arListInt.add(38);
		arListInt.add(2);
		arListInt.add(29);
		arListInt.add(5);
		arListInt.add(2);

		arListInt.sort(null);
		System.out.println("print sorted list " + arListInt);

	}

}
