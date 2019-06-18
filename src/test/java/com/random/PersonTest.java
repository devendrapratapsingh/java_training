package com.random;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person=null;

    @Test
    public void defaultConstructorPersonTest() {

        person  = new Person();
        Assert.assertEquals(true, PersonFactory.getRandomPersonList().add(person));
    }

    @Test
    public  void parameterisedConstructorTest()
    {
        person = new Person(true, 25, "test");
        Assert.assertEquals(true, PersonFactory.getRandomPersonList().add(person));
    }
}
