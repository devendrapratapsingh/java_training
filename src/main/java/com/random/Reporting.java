package com.random;

import java.util.ArrayList;
import java.util.List;

public class Reporting {
	
	private static List<Person> humanFilteration=new ArrayList<Person>();
	private static List<Person> nameFilteration=new ArrayList<Person>();
	private static List<Person> ageFilteration=new ArrayList<Person>();

	public static void main(String[] args)
	{
	for(Person persons :humanFilteration)
	{
		System.out.println(persons.getAge()+" "+persons.getName()+" "+persons.isHuman());
		
	}
	
	for(Person persons :nameFilteration)
	{
		System.out.println(persons.getAge()+" "+persons.getName()+" "+persons.isHuman());
		
	}
	for(Person persons :ageFilteration)
	{
		System.out.println(persons.getAge()+" "+persons.getName()+" "+persons.isHuman());
		
	}
	}
	
	public static List<Person> filterPersonByHumanFlag(List<Person> persons,boolean humantype_criteria)
	{

		for(Person person: persons){
			if((person.isHuman())==(humantype_criteria))
			{
				humanFilteration.add(person);
			}
		}
		return humanFilteration;
	}

	public static List<Person> filterPersonByName(List<Person> persons,String name_criteria)
	{
		for(Person person: persons){
         if(person.getName().toLowerCase().contains(name_criteria)||person.getName().toUpperCase().contains(name_criteria))
         {
        	 nameFilteration.add(person);
         }
	}
	return nameFilteration;
	}
	
	public static List<Person> filterPersonByAgegeaterThan(List<Person> persons,int age_criteria)
	{
		for(Person person: persons){
			{
				if(person.getAge()>age_criteria)
				{
					ageFilteration.add(person);
				}
			}
	}
	return ageFilteration;
	}
	

}
