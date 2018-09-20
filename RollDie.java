/***********************************************
 * Created by: Younes Elfeitori
 * Created on : 20 September 2018
 * This program returns a random variable
 ************************************************/
import java.util.Random;
import java.util.Scanner;

public class RollDie {
	
	public static void main(String args[]){
		//Asks to insert a number to be a max value
		Scanner userinput = new Scanner(System.in);
		int userint;
		System.out.print("Insert Max Value.");
		userint = userinput.nextInt();
		RollDie(userint);
		
	}
	//asks to insert a positive number if a negative was entered 
	public static int RollDie(int maxValue){
		int ComputerGen = new Random().nextInt(maxValue) +1;
		if (maxValue <= 0) {
			System.out.print("Choose a positive number");
	}
		//Inserts random number
			System.out.print("Your number is " + ComputerGen);
        return maxValue;

	}

}
