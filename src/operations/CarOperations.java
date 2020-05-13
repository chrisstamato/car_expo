package operations;

import java.util.Scanner;

import repositories.CarData;

public class CarOperations {

	
	public static void main (String[]args) {
		
		run();
	}
	
	private static void run() {
		
		CarData.initialize();

//        Scanner sc = new Scanner(System.in);
		
		boolean execution = true;
		
		while (execution) {
			
			menu();
			
			int menuChoice = menuChoice();
			
			switch(menuChoice) {
			
				case 1:
					CarData.retrieveAllCars();
					break;
				
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					execution = false;
					System.out.println("Ending program");
					break;
					
			}
		
		}
	
	}

	private static int menuChoice() {
		
	    Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(choice < 1 || choice > 5) {
			
			try {
			
			choice = sc.nextInt();
			
			}catch (Exception ex) {
				 sc.next();
	             System.out.println("Μη έγκυρη τιμή");
			}

			if(choice < 1 || choice > 5) {
				System.out.println("Εισάγετε επιλογή [1-5]");
			}
		
		}
		
		return choice;
	}

	private static void menu() {
		System.out.println(
				"------------Μενού Επιλογών------------ \n" +
				"1. Παρουσίαση όλων των αυτοκινήτων \n" +
				"2. Προσθήκη ένός αυτοκινήτου \n" +
				"3. Διαγραφή ενός αυτοκινήτου \n" +
				"4. Επεξεργασία αυτοκινήτου \n" +
				"5. Έξοδος \n" +
				"Εισάγετε επιλογή [1-5]");
		
	}

	

}
