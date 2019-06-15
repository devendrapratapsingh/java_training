package com.random;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ReportingTest {
    ArrayList<Person> persons=null ;
    Reporting reporting=null;


    @Before
     public  void  setUp() {
        Person person1 = new Person(true, 25, "priya");
        Person person2 = new Person(true, 26, "abc");
        Person person3 = new Person(false, 25, "xyz");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    @Test
    public void getfilterPersonByHumanFlag(){
        reporting =new Reporting();
        assertNotNull(reporting);


}

}
