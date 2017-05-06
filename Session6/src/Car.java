
public class Car {
	
	public Car(int year) {
		this.year = year;
	}
	
	private String color;
	public int mpg;
	public String model;
	public String brand;
	public int tankSize;
	
	private int year;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printYear() {
		System.out.println(year);
	}
	
	public void printFillupPrice() {
		// 1 gallon = 2.5;
		System.out.println(getFillupPrice(tankSize));
	}
	
	//---
	private double getFillupPrice(int tankSize) {
		double fillup = tankSize * 2.5f;
		return fillup;
	}
}
