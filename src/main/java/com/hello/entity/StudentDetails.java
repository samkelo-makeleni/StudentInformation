package com.hello.entity;

public class StudentDetails{
	private int stdno;
	private String name;
	private String surname;
	private String gender;
	private int age;
	private String dep;
	
	public StudentDetails(int stdnoo, String names, String surnamee, String genderr, int agee,String depart) {
		super();
		this.stdno = stdnoo;
		this.name = names;
		this.surname = surnamee;
		this.gender = genderr;
		this.age = agee;
		this.dep=depart;
	}
	public int getStdno() {
		return stdno;
	}
	public void setStdno(int stdno) {
		this.stdno = stdno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
     
}
