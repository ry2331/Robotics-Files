/***************************************
 * RAYMOND YANG
 * DREITES PROGRAMMIERPROJEKT
 * 25. OKT. 2017
 **************************************/
 public class ExerciseOne
 {
 	public static void main(String[]args)
 	{
 		int count = 5;

 		System.out.println("Ungerade Zahlen");
 		for(int i=1; i<=count; i++) {
 			System.out.println((2*i -1));
 		}

 		System.out.println("Gerade Zahlen");
 		for(int i=1; i<=count; i++) {
 			System.out.println((2*i));
 		}

 	}
 }

 public class ExerciseTwo
 {
 	public static void main(String[]args)
 	{
 		int colons = 4, seed;

 		int initcolons = (2 *colons -1);
 		for(int i=1; i<=4; i++)
 		{
 			seed = (2*colons - 1);

 			for(int space = 1; space <= ((initcolons - seed)/2); space++) {
 				System.out.printf(" ");
 			}
 			System.out.printf("\\");

 			for(int coloncounter = 1; coloncounter <= seed; coloncounter++) {
 				System.out.printf(":");
 			}
 			System.out.println("/");
 			colons--;
 		}

 	}
 }
