package com.sachin.collection2;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class TestEnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<days> set = EnumSet.of(days.MONDAY, days.SUNDAY);
		set = EnumSet.allOf(days.class);
		Iterator<days> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println("" + itr.next());
		}
		EnumMap<days, String> enummap = new EnumMap<days, String>(days.class);
		enummap.put(days.MONDAY, "1");
		enummap.put(days.THURSDAY, "2");
		enummap.put(days.TUESDAY, "3");
		enummap.put(days.WEDNESDAY, "4");
		enummap.put(days.THURSDAY, "5");
		for (Map.Entry<days, String> mapentry : enummap.entrySet()) {
			System.out.println(" " + mapentry.getKey() + "  " + mapentry.getValue());

		}

	}
}
