import java.util.Scanner;

public class calculator
	{
		static Double userNumber1 = 0.0;
		static Double userNumber2 = 0.0;
		public static void main(String[] args)
			{
			Scanner userinput2 = new Scanner(System.in);
			System.out.println("Welcome to the java calculator. What would you like to do?");
			System.out.println("1) Addition ");
			System.out.println("2) Subtraction ");
			System.out.println("3) Multiplication ");
			System.out.println("4) Division ");
			System.out.println("5) Exponents ");
			Double calculation = userinput2.nextDouble();
			if (calculation == 1)
				{
				asking();
				System.out.println("The answer is " + add(userNumber1, userNumber2) + ".");
				}
			else if (calculation == 2)
				{
				asking();
				System.out.println("The answer is " + subtract(userNumber1, userNumber2) + ".");
				}
			else if (calculation == 3)
				{
				asking();
				System.out.println("The answer is " + multiply(userNumber1, userNumber2) + ".");
				}
			else if (calculation == 4)
				{
				asking();
				System.out.println("The answer is " + divide(userNumber1, userNumber2) + ".");
				}
			else
				{
				asking();
				System.out.println("The answer is " + Math.pow(userNumber1, userNumber2) + ".");
				}
			System.out.println("Good job. Hit run again to preform another calculation.");
			}

		public static void asking()
			{
			Scanner userinput2 = new Scanner(System.in);	
			System.out.println("What is the first number in the equation?");
			userNumber1 = userinput2.nextDouble();
			System.out.println("What is the second number in the equation?");
			userNumber2 = userinput2.nextDouble();
			}
		public static Double add(Double x, Double y)
			{
			return x + y; 
			}	
		public static Double subtract(Double x, Double y)
			{
			return x - y;
			}
		public static Double multiply(Double x, Double y)
			{
			return x * y;
			}	
		public static Double divide(Double x, Double y)
			{
			return x/y;
			}

	}
