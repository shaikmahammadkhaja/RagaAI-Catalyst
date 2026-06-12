package acesss_runtime;

public class Bmw implements Car{
	public void milage() {
		System.out.println("10");
		
	}
	public void brand() {
		System.out.println("Bmw");
		
		
	}
	public static void main(String[] args) {
		Bmw bmw=new Bmw();
		bmw.milage();
		bmw.brand();
		
	}

}
