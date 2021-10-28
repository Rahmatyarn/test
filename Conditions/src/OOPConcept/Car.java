package OOPConcept;

public class Car {

	//Any thing we write outside of the main method is considered as global variable. 
	int mod;
	int wheel;
	
	
	
	public static void main(String[] args) {
		// new car(); -- this is the object of car class
		
		Car a = new Car();
		Car b = new Car();
		Car C = new Car();
		
		//Which is our Object? new Car();
		//What is a,b,C -----> Object Reference Variables. 
		
		
		a.mod = 20;
		a.wheel = 23;
		
		b.mod = 2014;
		b.wheel = 2023;
		
		C.mod = 88;
		C.wheel = 99;
		
		System.out.println("before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(b.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(C.mod);
		System.out.println(C.wheel);
		
		System.out.println("after shifting the ");
		
		a=b;
		b=C;
		C=a;
		
		a.mod=10;
		System.out.println(a.mod);
		C.mod=20;
		System.out.println(a.mod);
		System.out.println(C.mod);
		
		
		
		
		
		
		
		
		
		
		
	}

}
