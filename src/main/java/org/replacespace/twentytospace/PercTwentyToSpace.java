/**
 *   File Name: PercTwentyToSpace.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 23, 2018
 *   
 */

package org.replacespace.twentytospace;


/**
 * PercTwentyToSpace //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class PercTwentyToSpace {
	
	public static String replace20toSpace(String str) {
		return str.replaceAll("%20", " ");
	}
	
	public static String replaceSpacesTo20(String str) {
		return str.replaceAll(" ", "%20");
	}
	
	public static void main(String[] args) {
		
		String originWith20 = "This%20is%20string%20with%20chars20%20instead%20of%20spaces";
		System.out.println("originWith20: " + originWith20);
		System.out.println("Modified:     " + replace20toSpace(originWith20));
		
		String originWithSpaces = "This is string with spaces";
		System.out.println("originWithSpaces: " + originWithSpaces);
		System.out.println("Modified:         " + replaceSpacesTo20(originWithSpaces));
		
	}
}
