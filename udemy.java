/*
This contains exercises from 'Java Programming Masterclass updated to Java 17' from udemy 
(https://deloittedevelopment.udemy.com/course/java-the-complete-java-developer-course/)
*/

public class udemy {
	public static void main(String[] args) {
		//Section 3 - First Steps
			System.out.println("Hello World");
			System.out.println("Hello, Razvan");
		
		/*Section 3 - First Steps
		==Variables==
		-In general variables must be initialised before use.
		-A declaration statement is used to define a variable 
		 by indicating the data type, and the name, then 
		 optionally to set the variable to a specific value.
		-You can only declare once in a java block.
		-An expression is a coding construct, that evaluates to a single value.
		*/
		int myFirstNumber = 5; //declaration statement
			System.out.println("Variable value is:" + myFirstNumber);
		myFirstNumber = 10; //assigned a new value to the variable
			System.out.println("New value is:" + myFirstNumber);
		myFirstNumber = 1000; //change again - challenge
			System.out.println("New new value is:" + myFirstNumber);
		myFirstNumber = 10 + 5; //value change using math
			System.out.println("Math value is:" + myFirstNumber);
		myFirstNumber = (10 + 5) + (2 *10); //more math
			System.out.println("More math: " + myFirstNumber);
		//Java operators (+, *, etc) perform an operation on a variable value.
		
		/*Section 3 - First Steps
		==Starting out with Expressions==*/
		int mySecondNumber = 12;
		int myThirdNumber = 6;
		//use variable names directly in the expression of a declaration
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
			System.out.println("Total is " + myTotal);
		//more operations
		myThirdNumber = myFirstNumber * 2;
		myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
			System.out.println("New total is " + myTotal);
		//challenge
		int myLastOne = 1000 - myTotal;
			System.out.println("My Last Math is " + myLastOne);
		
		/*Section 3 - First Steps
		==Primitive Types==
		-most basic data types
		-8 primitive data types by type of data stored for each:
			1. whole number: byte, short, int, long
			2. real number: float, duble
			3. single character: char
			4. boolean value: boolean*/
		int myValue = 10000; //integer is a whole number, no fractions or decimals
		int myMinIntValue = Integer.MIN_VALUE; //find out minimum value for int datatype using the wrapper class (Integer)
		int myMaxIntValue = Integer.MAX_VALUE; //find out maximum value for int datatype
			System.out.println("Integer Value Range: ("+ myMinIntValue +" to "+ myMaxIntValue+ ")");
			System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); //Overflow - put a value larger than max into an int
			//maximum value when it overflows wraps around to the minimum value and continues processing
			System.out.println("Busted Min Value = " + (myMinIntValue - 1)); //Underflow - put a smaller value than min into an int
			//minimum value when it underflows wraps around to the maximum value and continues processing
		/*int myMaxIntTest = 2147483648;
			-Assigning a value outside the range throws an error.*/
		
		/*Section 3 - First Steps
		==byte, short, long and width==
		-byte supports the smallest range
		-long support the largest range
		-byte < short < int < long
		-Size, or Width is the amount of space (in memory)that determines (or limits) 
		 the range of values we've been discussing:
			-A byte can store 256 numbers and occupies 8 bits and has a width of 8.
			-A short can store a large range of numbers and occupies 16 bits and has a width of 16.
			-An int has a much larger range, 32 bits and width of 32.
			-A long has 64 bits and width of 64.*/
			System.out.println("Byte Value Range: (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
			System.out.println("Short Value Range: (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
		long myLongValue = 100L; //Java default stores as int. We've stored a small value (100) as a long
			System.out.println("A Long has a width of: " + Long.SIZE);
		  	System.out.println("Long Value Range: (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
		
		/*Section 3 - First Steps
		==Casting in Java==
		Casting is a way to get Java to treat a variable of one type like a different data type.*/
		byte myMinByteValue = Byte.MIN_VALUE;
		/*byte myNewByteValue = (myMinByteValue / 2); -throws error incompatible type
			-Java compiler does not attempt to evaluate the value, in a variable, when it's used
			in a calculation, so it doesn't know if the value fits and throws an error.
			-We let Java know that it will fit with a concept called Casting.
			-Casting means to treat or convert a number from one type to another.
			-We put the type we want the number to be in parantheses.*/
		byte myNewByteValue = (byte) (myMinByteValue / 2);
			System.out.println("myNewByteValue is: " + myNewByteValue);
			
		/*Section 3 - First Steps
		==Primitive Types Challenge==
		Create four new variables:
			-A byte variable, set it to any valid byte number, it doesn't matter.
			-A short variable, set it to any valid short number.
			-An int variable, set it to any valid integer number.
			-A long variable. Make it equal to 50000 plus 10 times the sum of the values of the first 3 variables
			(your byte, your short and your int values). In other words, use the variable names in your expression
			to calculate the sum.*/
		byte aByteVar = 100;
		short aShortVar = 20_000;
		int aIntVar = 3_000_000;
		long aLongVar = (50_000 + (10 * (aByteVar + aShortVar + aIntVar)));
			System.out.println("My Long variable is: " + aLongVar);

		/*Section 3 - First Steps
		==Float and Double Primitives==
		-Floating-point number is used for more precision in calculations.
		-There are 2 primitive types in Java for expressing floating-point numbers, the float and the double.
		-The double is Java's default type for any decimal or real number because it is more precise.
		-Precision refers to the format and amount of space occupied by the relevant type.
		-Width and range for float and double:
			-float - width 32 bits, min value = 1.4E-45 (1.4 x 10 to the power 45), max value = 3.4028235E38 (3.4 x 10 to the power 38)
			-double - width 64 bits, min value = 4.9E-324, max value = 1.7976931348623157E308*/
			System.out.println("Float Range Value (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
			System.out.println("Double Range Value (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
		int myIntValue = 5;
		float myFloatValue = 5;
		double myDoubleValue = 5;
			System.out.println("Values are: myIntValue = " + myIntValue + ", " + "myFloatValue = " + myFloatValue + ", " + "myDoubleValue = " + myDoubleValue);
		
		/*Section 3 - First-Steps	
		==Floating Point Precision and a Challenge==
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
			
	}
}