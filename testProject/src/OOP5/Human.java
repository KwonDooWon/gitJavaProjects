package OOP5;

public abstract class Human {
	protected String name;
	protected int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public abstract void makeSound();
}
