package com.random;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

      public class ReportingTest {
          List<Person> persons=null ;
          Person person1=null;
          Person person2=null;
          Person person3=null;
          Reporting reporting=null;


          @Before
          public void prepareList(){
              person1 = new Person(true, 25, "priya");
        person2 = new Person(true, 26, "abc");
        person3 = new Person(false, 25, "xyz");
        persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        reporting = new Reporting();

          }

         @Test
          public void filterPersonByHumanFlagTest() {
              assertNotNull(this.reporting.filterPersonByHumanFlag(persons,true));
          }
          @Test
          public  void filterPersonByNameTest(){
              assertNotNull(this.reporting.filterPersonByName(persons,"a"));
         }
         @Test
          public void filterPersonByAgegeaterThanTest(){
              assertNotNull(this.reporting.filterPersonByAgegeaterThan(persons,2));
         }


      }
