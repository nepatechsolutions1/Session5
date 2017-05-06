
public class Dog {
	
	Dog(String name) {
		this.name = name;
	}
	
	public String name;
	public String breed;
	public int age;
	public String sound;
	
	public void bark() {
		System.out.println(sound);
	}

}
