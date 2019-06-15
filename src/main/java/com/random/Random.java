package com.random;

import java.util.List;


/**
 *To facilitate a functionality of randomizer
 */
public class Random {
	/**
	 * To get a random value from a list
	 * @param inputList
	 * @param <T>
	 * @return Return a value type T
	 */
		public <T> T getRandomValue(List<T> inputList)
		{   assert(inputList!=null);
		int i=0;
			long time=System.nanoTime();
			int length=inputList.size();
			int randomIndex=(int) (time % (length + i));
			return inputList.get(randomIndex);
		}
		
}