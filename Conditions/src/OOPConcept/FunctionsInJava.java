package OOPConcept;

public class FunctionsInJava {
	//Main method is the starting point of execution. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all not static methods will be given to this object
		//How to call test method?
		//For calling non static methods we always have to call the object
		obj.test();
		int c = obj.naqib();
		System.out.println(c);
		obj.qa();;
		int d = obj.division(30, 10);
		System.out.println(d);
		
		//main method is void -- it never returns a value.
		
	}
//how to create a method?
	public void test() {
		System.out.println("test method");	
		
	}
	//Void means does not return any value. remove void and replace it with data type
	//2nd Method
	public int naqib() {
		System.out.println("This is naqib method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	
}
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
	}
	
	
	
}
