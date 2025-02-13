package java_prac2024;

import java.util.ArrayList;

public class arrayListlec {

	public static void main(String[] args) {
		ArrayList<Integer> years = new ArrayList<Integer>();
		years.add(2019);
		years.add(2020);
		years.add(2021);
		years.add(2022);
		years.add(2023);
		years.add(2024);
		
		System.out.println(years.get(0));
		System.out.println(years.get(2));
		
		System.out.println(years.set(0, 2000));
		

	}

}
