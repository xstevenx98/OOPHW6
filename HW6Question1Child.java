	/**
	 * File:			HW6Question1Child.java
	 * 
	 * Package: 		HW6Question1Part2
	 * 
	 * Author: 			Steven Imas
	 * 
	 * Description:		Question 1: Access a protected variable of the parent class from a 
	 * 					child class. Make sure that the parent and the child classes are in 
	 * 					different packages.
	 * 
	 * NOTE!: 			I included the call to getClass() to show that the variable being called is from the 
	 * 					parent class (which it did), but it made the output look awkward so I commented it out.
	 * 
	 */ 

public class HW6Question1Child  extends HW6Question1Parent {
	public static void main(String[] args) {
		
		HW6Question1Parent parent = new HW6Question1Parent();
		
		/** Local Variables **/
		int parentInt = 0;
		double parentDouble = 0.0;
		String parentString = "";
		
		
		parentDouble = getDoubleVar(parent);
		System.out.println("Parent Double: " + parentDouble );
		
		parentString = getStringVar(parent);
		System.out.println("\nParent String: " + parentString); 
		
		parentInt = getIntVar(parent);
		System.out.println("\nParent Int: " + parentInt);

		
	}
	
	/** Methods **/
	static int getIntVar(HW6Question1Parent p) {
		//System.out.println(p.getClass());
		return p.protectedIntVar;
	}
	
	static String getStringVar(HW6Question1Parent p) {
		//System.out.println(p.getClass());
		return p.protectedStringVar;
	}
	
	static double getDoubleVar(HW6Question1Parent p) {
		//System.out.println(p.getClass());
		return p.protectedDoubleVar;
	}
}


/******************************************************************

OUTPUT

Parent Double: 28.5

Parent String: Protected String Variable

Parent Int: 82

******************************************************************/