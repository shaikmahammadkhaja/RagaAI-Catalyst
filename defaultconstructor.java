package access_modifier;

public class defaultconstructor {
	
	public defaultconstructor() {
		System.out.println("iam default");
	}
	public static void main(String[] args) {
		defaultconstructor Defaultconstructor=new defaultconstructor();
		System.out.println("from main method");
		defaultconstructor Defaultconstructor2=new defaultconstructor();
	}

}
