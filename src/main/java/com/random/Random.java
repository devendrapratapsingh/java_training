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
		    Seed seed=new Seed();
			int length=inputList.size();
			int randomIndex=(int) (seed.getSeed() % (length));
			return inputList.get(randomIndex);
		}


    private class Seed {
        private long seed;

        public long getSeed() {
            return seed;
        }

        Seed() {
            this.seed = System.nanoTime();
        }

    }

}