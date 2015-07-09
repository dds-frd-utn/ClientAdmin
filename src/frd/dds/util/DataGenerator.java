package frd.dds.util;

import java.util.Random;

public class DataGenerator {

	private static String[] names = new String[]{"Pedro", "Roberto", "Ana", "María"};
	private static String[] surnames = new String[]{"Perez", "Gonzalez", "Smith"};
	private static String[] street = new String[]{"Rivadavia", "San Martin", "Belgrano"};
	
	private static Random rnd = new Random();
	
	public static String getPersonName(){
		return getRandom(names) + " " + getRandom(surnames);
	}
	
	public static String getAddress(){
		return getRandom(street) + " " + rnd.nextInt(1000);
	}
	
	private static String getRandom(String[] values){
		return values[ rnd.nextInt( values.length ) ];
	}
}
