
public class ObjectExample {

	public static void main(String[] args) {
		
		Dog tommy = new Dog("Tommy");
		tommy.breed = "Pomerian";
		tommy.age = 1;
		tommy.sound = "wof wof";
		
		Dog tiger = new Dog("Tiger");
		tiger.breed = "German Shephard";
		tiger.age = 5;
		tiger.sound = "bhow bhow";
				
		//tommy.bark();
		//tiger.bark();
		
		Car camry = new Car(1996);
		camry.brand = "Toyota";
	
		camry.mpg = 40;
		camry.model = "Camry";
		camry.tankSize = 14;
		camry.setColor("Black");
		
		Car sentra = new Car(2005);
		sentra.brand = "Nissan";
		sentra.setColor("White");
		sentra.mpg = 35;
		sentra.model = "Sentra";
		sentra.tankSize = 12;
		
		camry.printFillupPrice();
		sentra.printFillupPrice();
		
	}

}
