package com.shashi;

import java.util.ArrayList;
import java.util.List;

public class User implements Comparable<User> {
	private String fname;
	private String lname;
	public int age;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public static List<User> getList() {
			List<User> userList=new ArrayList<>();
			userList.add(new User("shashi", "bhusan", 34));
			userList.add(new User("chandra", "bhusan", 36));
			userList.add(new User("Raghavenra", "singh", 32));
			userList.add(new User("Pradeep", "sah", 31));
			return userList;
		}

		@Override
		public int compareTo(User o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
