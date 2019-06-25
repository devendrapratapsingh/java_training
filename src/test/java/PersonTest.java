package com.random;

import com.random.Person;
import com.random.PersonFactory;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    private Person person;

    @Test
    public void personTest(){

        person=new Person(true,25,"priya");
        Person p=new Person();
        Assert.assertEquals(true,PersonFactory.getRandomPersonList().add(person));
        Assert.assertNotNull(p);
        Assert.assertEquals(true,PersonFactory.getRandomPersonList().add(p));
    }
}
