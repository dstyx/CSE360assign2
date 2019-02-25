/**Name: Dean Styx
 * Class ID: 556
 * Assignment 2
 * 
 * This Class is designed to act as a calculator that will add, subtract, multiply
 * and divide numbers fed into each method respectively. This will all be worked on
 * a total that is already stored and worked on. For example if the user does 2+2 then
 * multiply 5, the total will be 20, not 2+2*5 = 12
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
/**
 * This function will return the current total.	
 */
	public int getTotal () {
		return 0;
	}
/**	
 *This function will add numbers to the total
 */
	public void add (int value) {
		
	}
/**
 * The subtract function will subract value from the total
 */
	public void subtract (int value) {
		
	}
/**
 * Multiply will multiply the total by a value give.
 */
	public void multiply (int value) {
		
	}
/**
 * Divide will divide the total by value unless the value is zero. If zero,
 * the total will become zero
 */
	public void divide (int value) {
		
	}
/**
 * The getHistory Function will be used to show the history for this iteration
 * of calculator, including zero 
 * @return
 */
	public String getHistory () {
		return "";
	}
}