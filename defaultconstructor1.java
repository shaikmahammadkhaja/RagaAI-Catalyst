package access_modifier;

public class defaultconstructor1 {
	int price;
	String color;
	
	public defaultconstructor1(int price,String color) {
		this.price=price;
		this.color=color;
		System.out.println(this.color);
		System.out.println(this.price);
	}
	public static void main(String[] args) {
		defaultconstructor1 Defaultconstructor1=new defaultconstructor1(24,"white");
	}

}

