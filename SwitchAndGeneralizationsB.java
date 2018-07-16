/****************************************
*             							*
*	SwitchAndGeneralizationsB.java               	*
*	Codecademy                          *
*	Monday July 16, 2018   				*
*									 	*
*****************************************/
public class SwitchAndGeneralizationsB {
	public static void main(String[] args) {
		
	//Switch: 
	char penaltyKick = 'L';

	switch (penaltyKick) {

		case 'L': System.out.println("Messi shoots to the left and scores!");
			break;

		case 'R': System.out.println("Messi shoots to the right and misses the goal!");
			break;

		case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
			break;

		default: 
			System.out.println("Messi is in position...");
		}

	}
}