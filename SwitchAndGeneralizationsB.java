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

//GeneralizationsB:
		// set tricky to the same value as:( 3 >= 3 && !(true || true))
		boolean tricky = false;

		//This if stmt changed to make the else block run: 
		//From: if !(2015 < 2016) {
		//To:
		if (2015 > 2016) {
		
		 	System.out.println("Stuck in the past...");
		
		} else {
			
			System.out.println("Upgraded to the future!");

		}

//Set the value of int so that the case of the Brooklyn train runs:
		int subwayTrain = 5;

			switch (subwayTrain){

				case 1 : System.out.println("This is a South Ferry bound train!");
						break;

				case 5 : System.out.println("This is a Brooklyn bound train!");
						break;

				case 7 : System.out.println("This is a Queens bound train!");
						break;

				default: 
					System.out.println("I'm not sure where that train goes...");

			}
		}
}