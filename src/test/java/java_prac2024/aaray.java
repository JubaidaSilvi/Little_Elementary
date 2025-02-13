package java_prac2024;

public class aaray {

	public static void main(String[] args) {
		//Store 4 whole number using array
		
		int[]wholenumber= {10,20,30,40};
		 for(int m: wholenumber)
		{System.out.println(m);}

		 
		 
		// store  3 car brand data using array
			
		 String[] cars = {"BMW", "Honda", "Toyota"};
	     
	     // Print the length of the array
	     System.out.println(cars.length);
	     
	     
	     //Assignment
	     //1.store 10 flower name using array
	    // 2. change 4th flower with different flower
	    // 3. find out length of array
	     //store 10 flower name using array
	     String[] flowers = {"Rose", "Lily", "Tulip", "Daisy", "Orchid", "Sunflower", "Jasmine", "Marigold", "Lotus", "Daffodil"};
	     
	     flowers[3]="Belly";
	     System.out.println(flowers[3]);
	     
	     System.out.println(flowers.length);
	     
	     for(String flower:flowers)
	    	 System.out.println(flower);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

	
}
