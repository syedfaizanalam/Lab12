import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the GC Car terminal admin page!\n");
		System.out.println("How many cars are you entering?");
		int carNum = scnr.nextInt();

		for (int i = 0; i < carNum; i++) {
			addCar();
		}
		
		System.out.println("Current Inventory: ");
		for (Car car : cars) {
			System.out.printf("%-12s %-12s %-12s $%.2f\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
		}	
		
	/*	
		for (Car car : cars) {
			System.out.printf("%-12s %-12s %-12s $%.2f\n", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
		}
		
		*/
	}
	
	public static void addCar() {
		Car car = new Car();
		System.out.print("Make: ");
		car.setMake(scnr.nextLine());
		
		System.out.print("Model: ");
		car.setModel(scnr.nextLine());
		
		System.out.print("Year: ");
		car.setYear(scnr.nextInt());
		
		System.out.print("Price: ");
		car.setPrice(scnr.nextDouble());
		
		scnr.nextLine();
		
		cars.add(car);
		
	}
	
	public static void listCars() {
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " +(i + 1)+ ": " + cars.get(i));
		}
	}
}
