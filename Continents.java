/****************************************
*             							*
*	Continents.java               		*
*	Codecademy                          *
*	Monday July 16, 2018   				*
*										*
*	A program that prints 				*
* 	a continent and the largest city 	*
*	on that contenent, based on the 	*
*	value of an integer.				*
*									 	*
*****************************************/
public class Continents {
	public static void main(String[] args) {
		
	//1. Create an int variable called continent 
	//and set it equal to 4: 
	int continent = 4;

	//2. Create a switch statement that will switch
	//based on the value of continent: 
	switch (continent) {
	/*3. Inside the switch statement, add a case that
	will run when the value of continent is 1. 
	4. When the value of continent is 1 print out 
	North America: Mexico City, Mexico.
	5. Make sure the next line exits out of the case. */

		case 1 : System.out.println("North America: Mexico City, Mexico");
			break;

	/*6. Add another case  that will run when the value of continent is 2. 
	When this value is met, print out: South America: Sao Paulo, Brazil.
	7. Make sure the next line exits out of the case. */
		case 2 : System.out.println("South America: Sao Paulo, Brazil");
			break;

	/*8. Add another case that will run when the value of continent is 3. 
	When this value is met, print out: Europe: Moscow, Russia. Make sure
	the next line of code exits out of the case. */

		case 3 : System.out.println("Europe: Moscow, Russia");
			break;

	/*9. Add another case that will run when the value of continent is 4.
	When this value is met, print out: Africa: Lagos, Nigeria. Make sure
	the next line exits out of the case.  */
		case 4 : System.out.println("Africa: Lagos, Nigeria");
			break;

	//*10.
		case 5 : System.out.println("Asia: Shanghia, China");
			break;

		case 6 : System.out.println("Australia: Sidney, Australia");
			break; 

		case 7 : System.out.println("Antarctica: McMurdo Station, US");
			break;

			default : 
				System.out.println("undefined continent!");
				break;
		}
	}			
}