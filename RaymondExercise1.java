
/***************************************
 * RAYMOND YANG
 * erste Programmierübung
 * 25. Okt. 2017
 **************************************/


public class ExerciseOne
{

    public static void main(String[] args)
	{
		String name, teamName, department, somethingToBragAbout, schoolYear;
		int teamNumber;
		name = "Bob Marley";
		teamName = "Red October";
		department = "Information Services";
		somethingToBragAbout = "Reigning Beer-chugging contest champion";
		schoolYear = "1917-1918";
		teamNumber = 1918;

		System.out.println("***************************************");
		System.out.println(name + " " + teamName);
		System.out.println(department + " " + teamNumber);
		System.out.println(somethingToBragAbout + " " + schoolYear);
		System.out.println("***************************************");
  	}

}

public class ExerciseTwo
{

    public static void main(String[] args)
	{
		double numOne, numTwo, sum, diff, product, quotient;
		numOne = 4.5676;
		numTwo = 7.7765;

		sum = numOne + numTwo;
		diff = numOne - numTwo;
		double prod = numOne * numTwo;
		double quot = numOne / numTwo;

		System.out.println("The sum of " + numOne + " and " + numTwo + " is " + sum + ".");
		System.out.println("The difference of "+ numOne + " and " + numTwo + " is " +  diff + "." );
		System.out.println("The product of " + numOne + " and " + numTwo + " is " + prod + ".");
		System.out.println("The quotient of " + numOne + " and " + numTwo + " is " + quot + ".");
  	}

}
