package com.sachin.topic.constructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeepCopy {

public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setId(101);
		employeeInfo.setName("Harshit");
		HashMap<String, String> prop = new HashMap<String, String>();
		prop.put("Depatment", "Software");
		prop.put("Salary", "40000");
		prop.put("profile", "Developer");

		employeeInfo.setProps(prop);
		EmployeeInfo employeeInfoClone = (EmployeeInfo) employeeInfo.clone();
		employeeInfo.setName("Abhishek");
		prop.put("Timing", "9 hours");
		employeeInfo.setProps(prop);

		System.out.println("------------EmployeeInfo Object -----------");
		System.out.println(employeeInfo.getId());
		System.out.println(employeeInfo.getName());
		System.out.println(employeeInfo.getProps());

		System.out.println("------------Clone EmployeeInfo Object -----------");
		System.out.println(employeeInfoClone.getId());
		System.out.println(employeeInfoClone.getName());
		System.out.println(employeeInfoClone.getProps());

	}

}

class EmployeeInfo implements Cloneable {
	int id;
	String name;
	Map<String, String> props = new HashMap<String, String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> props) {
		this.props = props;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmployeeInfo employee = (EmployeeInfo)super.clone();
		//employee.setProps(null);
		HashMap<String,String> map = new HashMap<String, String>();
        Set<String> hashSet = employee.getProps().keySet();
        Iterator<String > itr = hashSet.iterator();
        while(itr.hasNext())
        {
        	String key = itr.next();
        	String value = employee.getProps().get(key);
        	map.put(key, value);
        }
        employee.setProps(map);
        return employee;
	}

}
