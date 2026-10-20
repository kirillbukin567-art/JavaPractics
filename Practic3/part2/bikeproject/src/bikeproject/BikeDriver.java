package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {

		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

		// Шаги 8-9: меняем высоту столба bike1 с 22 на 20 и выводим значения на экран
		bike1.setPostHeight(15);
		System.out.println("\n--- bike1 после изменения высоты столба ---");
		bike1.printDescription();
	}//end method main

}//end class BikeDriver
//javac bikeproject/*.java
//java bikeproject.BikeDriver