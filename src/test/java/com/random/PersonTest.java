package com.random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person person=null;
    PersonFactory personfactory=null;

    @Before
    public  void SetUp()
    {
        person  = new Person();
        personfactory =new PersonFactory();

    }
    @Test
    public void defaultConstructorPersonTest() {

    Assert.assertEquals(true, personfactory.getRandomPersonList().add(person));
    }

    @Test
    public  void parameterisedConstructorTest()
    {
        person = new Person(true, 25, "test");
        Assert.assertEquals(true, personfactory.getRandomPersonList().add(person));
    }
}
