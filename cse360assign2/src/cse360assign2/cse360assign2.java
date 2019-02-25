/**
 * Name: Dean Styx
 * Class ID: 556
 * This class will be used to test and prove that Calculator is working correctly
 * by running it though some tests.
 */

package cse360assign2;

public class cse360assign2 {

	
	public static void main(String[] args) {
		
		int first = 4;
		int second = 2;
		int third = 1;
		
		Calculator test = new Calculator();
		
		test.add(first);
		test.subtract(second);
		test.multiply(first);
		test.divide(2);
		test.divide(0);
		
		System.out.println(test.getTotal());
		
		
	}
}
