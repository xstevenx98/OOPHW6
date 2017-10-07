	/**
	 * File:			HW6Question1Parent.java
	 * 
	 * Package: 		OOPHomework6
	 * 
	 * Author: 			Steven Imas
	 * 
	 * Description:		Question 1: Access a protected variable of the parent class from a 
	 * 					child class. Make sure that the parent and the child classes are in 
	 * 					different packages.
	 */ 


public class HW6Question1Parent {

			
		/** Protected Variables **/
		protected int protectedIntVar; 
		protected double protectedDoubleVar; 
		protected String protectedStringVar;
			
			
		/**  Constructor  **/
		
		protected HW6Question1Parent() {
			protectedStringVar = "Protected String Variable";
			protectedDoubleVar = 28.5;
			protectedIntVar = 82;	
		}
		
	}

