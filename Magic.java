/****************************************
*             							*
*	Magic.java                        	*
*	Codecademy                          *
*	Friday the 13th. July 13, 2018   	*
*									 	*
*****************************************/
import java.io.Console;


public class Magic {
	public static void main(String[] args)
	{
		//The orgininal number means the starting value
		//for myNumber. I started with 7.
		int myNumber = 7;
		int stepOne = myNumber * myNumber;
		int stepTwo = stepOne + myNumber;
		int stepThree = stepTwo / myNumber;
		int stepFour = stepThree + 17;
		int stepFive = stepFour - myNumber;
		int stepSix = stepFive / 6;
		//Console console = System.console();
		//console.printf(stepSix);
		System.out.println(stepSix);

		//No matter what the original value is, 
		//The output will always be 3!

	}

}
