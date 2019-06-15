package com.random;

/**
 * To specify the attributes of the person
 */
public class 	Person {
	private boolean isHuman;
	private int age;
	private String name;
	
	public boolean isHuman() {
		return isHuman;
	}
	public void setHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		
	}
	
	public Person(boolean randomIsHuman,int randomAge,String randomName) {
		
		this.age=randomAge;
		this.isHuman=randomIsHuman;
		this.name=randomName;
		}
		@Override
		public String toString()
		{
			return this.name;
		}
	}