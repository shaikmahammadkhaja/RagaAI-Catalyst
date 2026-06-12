package access_modifier;

public class defaultconstructorpar {
	int price;
	String colour;
	public defaultconstructorpar(int price, String colour) {
		this.price=price;
		this.colour=colour;
		System.out.println(this.price);
		System.out.println(this.colour);
		
	}
	public static void main(String[]args) {
		defaultconstructorpar jaggu=new defaultconstructorpar (26000,"black");
	}

}



