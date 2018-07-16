/****************************************
*             							*
*	Conditionals.java                  	*
*	Codecademy                          *
*	Monday July 16, 2018   				*
*									 	*
*****************************************/
public class Conditionals {
	public static void main(String[] args) {
		
		//Boolean AND (&&):
		if(1 < 4 && 0 > 5) {

			System.out.println("You ordered a cup of hot, mint tea.");

		//Boolean OR (||):	
		} else if (21 <= 19 || 17 >= 28) {
			
			System.out.println("You ordered freshly squeezed orange juice!");

		//Boolean NOT (!):	
		}else if ( !(true == true)) {
			
			System.out.println("You ordered hot cocoa!");

		}else {
			System.out.println("You ordered a cup of Java!");

		}

		char answerChoice = 'C';

		switch (answerChoice) {

			case 'A': System.out.println("You answered: " + answerChoice 
				+ ". Please try again.");		
				break;

			case 'B': System.out.println("You answered: " + answerChoice 
				+ ". Please try again.");
				break;
			
			case 'C': System.out.println("You answered: " + answerChoice
				+ ". That is correct!");
				break;

			case 'D': System.out.println("You answered: " + answerChoice
				+ ". Please try again.");
				break;

			default:
					System.out.println("Please select a valid answer choice.");
			
			}

			//Boolean operator precedence: 1st is not, 2nd is &&, 3rd  is ||:
			boolean riddle = !( 1 < 8 || (5 > 2 && 3 < 5));
			System.out.println(riddle);

	}
}