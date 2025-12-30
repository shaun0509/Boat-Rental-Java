import java.util.Scanner;
import java.text.DecimalFormat;
public class BoatRental
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###.00")
		
		//variable
		int iNumHrs = 0,iCount = 1;
		String sName, sSurname, sIDNum, sPin,sChoice;
		char cChoice1,cChoice,rTotalAmtBoats;
		double rTotalAmnt = 0,rBoatAmt = 0;
		
		
		final double DISCOUNT_ONE = 0.20;
		final double DISCOUNT_TWO = 0.25;
		final double TAX = 0.15;
		final String PIN = "94993";
		
		
		//input
		System.out.println("==============================================================");
		System.out.println("\tWelcome to THE VISIONARIES's BOAT REANTAL!");
		System.out.println("==============================================================");
		System.out.println("\n****Please Ensure that you have atleast one of:**** \n\t[1] Valid South African ID\n\t[2] PASSPORT\n\t[3] LICENCE");
		System.out.println("\n**Please collect PIN from the ADMIN to sign-up**");
		
		System.out.print("Enter PIN from the ADMIN to proceed: ");
		sPin = kb.nextLine();
		
		if(PIN.equals(sPin))
		{
			System.out.println("\n===============================================");
			System.out.println("Thank you for visiting our site");
			System.out.println("=================================================");
			
			
			//System.out.print("Do you want to continue <N>o and <Y>es: ");
			//cChoice1 = kb.next().charAt(0);			
		
			do
			{
				System.out.print("\n[A] Yacht\t\t\t\t R600.00\n[B] Fishing Boats\t\t\t R400.00\n[C] Sailing Dinghy\t\t\t R300.00\n[D] Fishing Charters\t\t\t R457.00\n[E] Rafters\t\t\t\t R250.00\n[F] Tours\t\t\t\t R390.00\n[G] Kayaks\t\t\t\t R210.00");
				
				System.out.println("\nEnter (1111) to terminate the program\nPlease choose the BOAT of your choice: ");
				cChoice = kb.next().charAt(0);
				cChoice = Character.toUpperCase(cChoice);
			
				System.out.println("\nEnter the number of hours you want to rent the boat for: ");
				iNumHrs = kb.nextInt();
				
				
				switch(cChoice)
				{
					case 'A': 
					{
						rBoatAmt = 600;
	
					} break;
					
					case 'B': 
					{
						rBoatAmt = 400;
					}break;
					
					case 'C':{
						rBoatAmt = 300;
						
					}break;
					case 'D':{
						
						rBoatAmt = 457;
					}break;
					case 'E':{
						
						rBoatAmt = 250;
						
					}break;
					case 'F':{
						
						rBoatAmt = 390;
						
					}break;
					case 'G':{
						
					rBoatAmt = 210;
					
					}break;
					
					default: System.out.print("Please choose any of the above");
					sChoice = kb.nextLine();
					
				
				}
				
				
				System.out.print("Do you want to continue <N>o and <Y>es: ");
				cChoice1 = kb.next().charAt(0);
				cChoice1 = Character.toUpperCase(cChoice1);
				
				rTotalAmtBoats += rBoatAmt;
				
				iCount ++;
			}
			while(cChoice1 != 'N');
			
	
			
		}
		
		
		
	}
}