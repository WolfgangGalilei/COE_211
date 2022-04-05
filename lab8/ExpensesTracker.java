import java.io.*;
import java.util.Scanner;
public class ExpensesTracker{
  public static void main(String[] args) throws IOException{

FileWriter fw=new FileWriter(new File("expenses.txt"), true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter outToFile=new PrintWriter(bw);
Scanner scan=new Scanner(System.in);
String nameOfTheUserInNeedToStoreHisPurchasesInALog,purchasedItemByTheUserInputedInTheCodeForStorage,answer;
double priceAkACostAKAFeeAKATollAKAExpenseAKAFareAKALevy;

do{
	System.out.print("Input your name: ");
	nameOfTheUserInNeedToStoreHisPurchasesInALog=scan.nextLine();
	System.out.print("What did you purchase? ");
	purchasedItemByTheUserInputedInTheCodeForStorage=scan.nextLine();
	System.out.print("How much did you pay? (in USD) ");
	priceAkACostAKAFeeAKATollAKAExpenseAKAFareAKALevy=scan.nextDouble();
	scan.nextLine();
	outToFile.println(nameOfTheUserInNeedToStoreHisPurchasesInALog+" purchased "+purchasedItemByTheUserInputedInTheCodeForStorage+" for "+priceAkACostAKAFeeAKATollAKAExpenseAKAFareAKALevy+" US Dollars.");
	System.out.print("Would you like to log another purchase? (y/n)");
	answer=scan.nextLine();
	}while(answer.equalsIgnoreCase("y"));
outToFile.close();

Scanner scanFromFile=new Scanner(new File("expenses.txt"));
System.out.print("Would you like to read a summary of your purchases?");
answer=scan.nextLine();
if(answer.equalsIgnoreCase("y")){
	while(scanFromFile.hasNext()){
		answer=scanFromFile.nextLine();
		System.out.println(answer);
	}
}

}
}
/*
So, so you think you can tell
Heaven from hell?
Blue skies from pain?
Can you tell a green field
From a cold steel rail?
A smile from a veil?
Do you think you can tell?
Did they get you to trade
Your heroes for ghosts?
Hot ashes for trees?
Hot air for a cool breeze?
Cold comfort for change?
Did you exchange
A walk on part in the war
For a lead role in a cage?
How I wish, how I wish you were here
We're just two lost souls
Swimming in a fish bowl
Year after year
Running over the same old ground
What have we found?
The same old fears
Wish you were here
*/