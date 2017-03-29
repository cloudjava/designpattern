package com.jp.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleCreteria implements Creteria {

	@Override
	public List<Person> meetCreteria(List<Person> persons) {
		List<Person> meetPersonList = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				meetPersonList.add(person);
			}
		}
		return meetPersonList;
	}

}
