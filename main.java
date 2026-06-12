package acesss_runtime;

public class main {
	public static void main(String[] args) {
		Animal animal;
		animal= new Cat();
		Cat c=(Cat)animal;
		c.cateats();
		animal.sound();
		animal= new Dog();
		animal.sound();
		animal= new lion();
		animal.sound();
		
		
		

	}

}
