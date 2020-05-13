package repositories;

import java.time.LocalDate;

import domain.Car;

public class CarData {
	
	public static Car[] arrayOfCars = new Car[100];
	
	public static void initialize() {

		Car car1 = new Car(1L, LocalDate.parse("2019-10-19"), "Ford", "Mustang", "Grey", "Muscle", "A1");
		
		Car car2 = new Car(2L, LocalDate.parse("2019-10-23"), "Toyota", "Corolla", "White", "Hatchback", "B1");
		
		Car car3 = new Car(3L, LocalDate.parse("2019-10-23"), "Toyota", "Supra", "Red", "Coupe", "B2");
		
		Car car4 = new Car(4L, LocalDate.parse("2019-10-23"), "Toyota", "RAV-4", "Black", "SUV", "B3");
		
		Car car5 = new Car(5L, LocalDate.parse("2019-10-24"), "Volvo", "XC60", "Silver", "SUV", "C1");
		
		arrayOfCars[0] = car1;
		
		arrayOfCars[1] = car2;
		
		arrayOfCars[2] = car3;
		
		arrayOfCars[3] = car4;
		
		arrayOfCars[4]= car5;	
		
	}
	
	public static void retrieveAllCars() {
		
		for(int i = 0; i < arrayOfCars.length; i++) {

			if (arrayOfCars[i] != null) {
			
			System.out.println(arrayOfCars[i]);

			}
			
		}

	}
	
	
	
	
}
