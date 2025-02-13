package java_prac2024;

public class lec3ifelse {

	public static void main(String[] args) {
		

	//1.write code to greet customer good morning , good noon, good afternoon, good evening
		
		
		int time= 20;
		
		if(time<12) {
			System.out.println("Good Morning everyone");
		}
		else if (time<14) {System.out.println("Good AfterNoon");}
		else if (time<16) {System.out.println("Good Noon");}
		else if (time<18) {System.out.println("Good evening");}
		else {System.out.println("Good Night");}
	
		//2. write code to get grade A, b, c, d and F highest 
		
		int marks=88;
		char grade='A';
		if(marks>=90)
		{System.out.println("Congratulation you got A");}
		else if (marks>=85) {System.out.println("Congratulation you got B");}
		else if (marks>=75) {System.out.println(" you got C");}
		else if (marks>=65) {System.out.println(" you got D");}
		
		else {System.out.println(" Fail");
		}
		}
}

