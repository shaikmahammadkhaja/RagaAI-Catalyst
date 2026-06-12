package access_modifier;

public class Studentdata {
	int id;
	String name;
	String branch;
	int age;
	void display(int id,String name,String branch,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.branch=branch;
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.branch);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Studentdata studentdata=new Studentdata();
		studentdata.display(1,"khaja","ece",23);
		Studentdata studentdata1=new Studentdata();
		studentdata1.display(12,"jagan","cse",24);
		Studentdata studentdata2=new Studentdata();
		studentdata2.display(14,"jaggu","cst",25);
		Studentdata studentdata3=new Studentdata();
		studentdata3.display(16,"giri","csd",27);
		Studentdata studentdata4=new Studentdata();
		studentdata4.display(18,"zak","neet",29);
		

		
		
		
		
		
	}

}
