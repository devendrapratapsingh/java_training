package com.random;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFactoryTest {

    PersonFactory personfactory=null;

    @Before
    public void Setup(){
        personfactory=new PersonFactory();
    }



    @Test
    public void getRandomPersonListTest(){

        assertNotNull(personfactory.getRandomPersonList());

    }
    @Test
    public void createRandomPersonListDefaultSizeTest(){
        assertEquals(10,personfactory.createRandomPersonList(0).size());

    }

}