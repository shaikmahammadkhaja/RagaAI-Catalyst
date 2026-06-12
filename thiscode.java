package access_modifier;

public class thiscode {
thiscode(){
	System.out.println("default");
}
thiscode(int a,int b) {
	this();
	System.out.println(a+b);
	
}
public static void main(String[] args) {
	thiscode Thiscode=new thiscode(9,9);
}

}
