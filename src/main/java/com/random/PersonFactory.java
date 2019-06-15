package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *To get the list of random persons
 */
public class PersonFactory {
	
	static List<Integer> ages=Arrays.asList(21,22,23,24,25,56,57,58,595,50,51,52,53,54,55,26,27,58,59,50,51,52,43,54,55,51);
	static List<String> names=Arrays.asList("priya","shivam","himanshu","riya","rajat","kirtika","ashima","bikram","anil","jestin","raj","krantika","jaya","priyanka","shiv","ayush","rita","kanchan","kirti","aneesha","vikram","arun","mathew","surbhi","sandarbh","joy");
	static List<Boolean> humanTypes=Arrays.asList(true,false);

	/**
	 * To give the  list of random persons to the user
	 *
	 * @return the list of type Person
	 */
	public static List<Person> getRandomPersonList() {
		return randomPersonList;
	}

	static  List<Person> randomPersonList=new ArrayList<Person>();

	public static  void  main(String args[])
	{
		createRandomPersonList(5);

	}

	/**
	 *To create the list of random person
	 * @param number_of_person
	 * @return the list of type Person
	 */
	public static List<Person> createRandomPersonList(int number_of_person)
	{
		Random random=new Random();

		 if(number_of_person==0)
         {
        	 number_of_person=10;
         }
		for(int i=0;i<number_of_person;i++)
		{
			Person person=new Person(random.getRandomValue(humanTypes),random.getRandomValue(ages),random.getRandomValue(names));
			randomPersonList.add(person);
		}		

		return randomPersonList;		
	}
	
	
	
	
	}

