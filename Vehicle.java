import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class Vehicle {
	Scanner sc = new Scanner(System.in);

	String company;
	String model;
	String colour;
	int price;

	public Vehicle() {
		System.out.println("Inside constructor with zero argument");
	}

	public Vehicle(String company) {
		System.out.println("Inside constructor with one argument");
		System.out.println(company);
	}

	public Vehicle(String company, String model) {
		System.out.println("Inside constructor with two argument");
		System.out.println(company + " " + model);
	}

	public Vehicle(String company, String model, String colour) {
		System.out.println("Inside constructor with three argument");
		System.out.println(company + " " + model + " " + colour);
	}

	public Vehicle(String company, String model, String colour, int price) {
		System.out.println("Inside constructor with four argument");
		System.out.println(company + " " + model + " " + colour + " " + price);
	}

	public String getCompany() {
		System.out.println("Enter company name: ");
		company = sc.nextLine();
		return company;
	}

	public void setCompany(String c) {
		company = c;
		System.out.println(" company value set to " + company);
	}

	public String getModel() {
		System.out.println("Enter model name: ");
		model = sc.nextLine();
		return model;
	}

	public void setModel(String m) {
		model = m;
		System.out.println("model value set to " + model);
	}

	public String getColour() {
		System.out.println("Enter colour : ");
		colour = sc.nextLine();
		return colour;
	}

	public void setColour(String c) {
		colour = c;
		System.out.println(" colour value set to " + colour);
	}

	public int getPrice() {
		System.out.println("Enter price: ");
		price = sc.nextInt();
		return price;
	}

	public void setPrice(int p) {
		price = p;
		System.out.println(" price value set to " + price);
	}

	public void horn() {
		System.out.println("pe po pe po");
	}

	public void breaks() {
		System.out.println("Breaks are applied");
	}

	public void acclerate() {
		System.out.println("Speed in increse");
	}

	public void Display() {
		System.out.println("Comapany is " + company);
		System.out.println("Model is " + model);
		System.out.println("Colour is " + colour);
		System.out.println("Price is " + price);
	}

	public static void main(String[] args) {

		Vehicle Bike = new Vehicle();

		Bike.horn();
		Bike.breaks();
		Bike.acclerate();

		Bike.getCompany();
		Bike.getModel();
		Bike.getColour();
		Bike.getPrice();
		Bike.Display();

		Bike.setCompany("Honda");
		Bike.setModel("Plus");
		Bike.setColour("black");
		Bike.setPrice(31232);

		Vehicle Car = new Vehicle("Bmw");
		Car.horn();
		Car.breaks();
		Car.acclerate();

		Car.getCompany();
		Car.getModel();
		Car.getColour();
		Car.getPrice();
		Car.Display();

		Car.setCompany("Hero");
		Car.setModel("Bx67");
		Car.setColour("Kesari");
		Car.setPrice(128438);

		Vehicle Truck = new Vehicle("Tata", "Hercules", "Green", 21378);

		Truck.horn();
		Truck.acclerate();
		Truck.breaks();

		Truck.getColour();
		Truck.getModel();
		Truck.getColour();
		Truck.getPrice();
		Truck.Display();

		Truck.setCompany("Ashok");
		Truck.setModel("SuperNova");
		Truck.setColour("Orange");
		Truck.setPrice(2388323);

	}

}
