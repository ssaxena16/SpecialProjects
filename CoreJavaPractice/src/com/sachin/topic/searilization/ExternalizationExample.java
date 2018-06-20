package com.sachin.topic.searilization;

import java.io.EOFException;
import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person = new Person(101, "Test");
		File file = new File("F:\\Programing\\EmployeeDetails.txt");
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(file);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(person);
			oo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// File file = new File("F:\\Programing\\EmployeeDetails.txt");
		FileInputStream fi;
		try {
			fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			System.out.println("" + (Object) oi.readObject());
			Person person1 = (Person) oi.readObject();
			oi.close();
			System.out.println("" + person1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// ... this is fine
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Person implements Externalizable {

	private int id;
	private String name;

	// private static final long serialVersionUID = 102831973239L;
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("PPPPPPPPP");
		while (in.available() > 0) {
			id = in.readInt();
			name = (String) in.readObject();
			if (name.startsWith("abc")) {
				System.out.println("" + name);
				name = name.substring(3);
			}
		}

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("tyesting");
		out.writeInt(id);
		out.writeObject("abc" + name);
	}

	public String toString() {
		return " " + id + "    " + name;
	}

}