/****************************************
*             							*
*	IfElseIfTernary.java               	*
*	Codecademy                          *
*	Monday July 16, 2018   				*
*									 	*
*****************************************/
public class IfElseIfTernary {
	public static void main(String[] args) {
		
		//If:
		int passcode = 42;
		if (passcode == 42) {
			System.out.println("Access granted.");
		}

		//IfElseif:
		int round = 4;

		if (round > 12) {
			
			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		} else {

			System.out.println("The boxing match hasn't started yet.");
		}

		//Ternary (no {} needed at all!!):ß
		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ?'Y' : 'N';
		System.out.println(canDrive);

	}
}