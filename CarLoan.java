/****************************************
*                                       *
* CarLoan.java                          *
* Codecademy                            *
* Sunday July 22, 2018                  *
*                                       *
* A program that calculates             *
* the montly payment, the interestRate  *
* on that payment, and then calculates  *
* the total due.                        *
*                                       *
*****************************************/
import java.io.Console;

class CarLoan {
  public static void main (String[] args) {
    
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    
    if (loanLength <= 0 || interestRate < 0) {
      
      System.out.println("You need to make a valid loan request.");
      
    } else if (downPayment > carLoan) {
      
      System.out.println("You don't need a loan today. Have a nice day.");
      
    } else {
      
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      
      System.out.println("Your payment this month is " + monthlyPayment);
      
    }  
  }
}