package acesss_runtime;

public class Child extends Bike {
	void display() {
		System.out.println("world");
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.show();
		child.display();
	}

}
