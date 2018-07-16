/****************************************
*             							*
*	IntroQuiz.java                     	*
*	Codecademy                          *
*	Friday the 13th. July 13, 2018   	*
*									 	*
*****************************************/

import java.io.Console;


public class IntroQuiz {
	public static void main(String[] args) {
		
	//1. What value will the variable endpoint store?
		int endpoint = 10 % 3;
		System.out.println(endpoint);
		//1
	//2. What does the following Java code do?
		System.out.println(8 <= 8);
		//Prints out true. 

	//3. What represents a single line commet in Java?
		// is a single line comment. 

	//4. What is a multiline comment in Java?
		/* is a multi-line comment */

	//5. What does the following expression evaluate to? 
		boolean quiz5 = (5 != 6);
		System.out.println(quiz5);
		//true

	//6. What will be stored in the variable gemdas?
		int gemdas = (10/5)*3;
		System.out.println(gemdas);
		//6

	/*7. Is it true or false: "Java will ignore the whitespace in code."
		true However, it is important to know how to use whitespace
		to structure code well. */

	//8. Are there any errors in the following line of code? 
		//int status = true;
		//Yes, true is a type boolean, not a type int. 
		//Change int to boolean. 
		boolean status = true;




	}

}