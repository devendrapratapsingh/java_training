package com.random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RandomTest {

    List<String> inputStringList=null;
    List<Integer> inputIntegerList=null;
    List<Boolean> inputBooleanList=null;
    Random random=null;
    @Before
    public void setUp() {
    this.inputStringList= Arrays.asList("xyz","abc","pqr","hjh","qwe","test","test123","test1234","test12345");
    this.inputBooleanList=Arrays.asList(true,false,true,true,false,true,true,false,true,true,false,true,true,false,true);
    this.inputIntegerList=Arrays.asList(21,22,23,24,25,56,57,58,595,50,51,52,53,54,55,26,27,58,59,50,51,52,43,54,55,51);
    random=new Random();

    }

    @Test
    public void getRandomValue_ForStringTypeList() {
        String firstRandomValue=this.random.getRandomValue(this.inputStringList);
        String secondRandomValue=this.random.getRandomValue(this.inputStringList);
        String thirdRandomValue=this.random.getRandomValue(this.inputStringList);

        assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
        assertNotEquals("Both the values should not match",secondRandomValue,thirdRandomValue);
    }
    @Test
        public void getRandomValue_ForBooleanTypeList() {
        boolean firstRandomValue = this.random.getRandomValue(this.inputBooleanList);
        boolean secondRandomValue = this.random.getRandomValue(this.inputBooleanList);
        boolean thirdRandomValue = this.random.getRandomValue(this.inputBooleanList);
        assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
        assertNotEquals("Both the values should not match",secondRandomValue,thirdRandomValue);
    }

        @Test
        public void getRandomValue_ForIntegerTypeList() {
        int firstRandomValue=this.random.getRandomValue(this.inputIntegerList);
        int secondRandomValue=this.random.getRandomValue(this.inputIntegerList);
        int thirdRandomValue=this.random.getRandomValue(this.inputIntegerList);
        assertNotEquals("Both the values should not match",firstRandomValue,secondRandomValue);
        assertNotEquals("Both the values should not match",secondRandomValue,thirdRandomValue);
        }


    @After
    public void tearDown()  {
       inputStringList=null;
       inputIntegerList=null;
       inputBooleanList=null;
       random=null;
    }
}