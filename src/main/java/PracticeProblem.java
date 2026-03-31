/**

        * File: Lesson 3.5 - Problem solving and good programing style

        * Author: Nithin.A

        * Date Created: March 30, 2026

        * Date Last Modified: March 31, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println("John".indexOf(" "));
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
	public static String getFirstName(String name){
		name = name.trim();
		int index = name.indexOf(" ");
		return name.substring(0, index);
	}
	public static String getLastName(String name){
		name = name.trim();
		int index = name.lastIndexOf(" ");
		return name.substring(index+1);
	}
	public static boolean isValidName(String name){
		name = name.trim();
		int indexFirst = name.indexOf(" ");
		int indexLast = name.lastIndexOf(" ");

		if (!name.contains(" ") || (name.indexOf(" ") != name.lastIndexOf(" "))){
			return false;
		}
		else if ((!(2 <= name.substring(0, indexFirst).length() && 2<=name.substring(indexLast+1).length()))){
			return false;
		}
		else {
			return true;

		}

		// if (2 >= name.substring(0, indexFirst).length() && name.substring(indexLast+1)){
		// 	return false;
		// }
		// else {
		// 	return name.indexOf(" ") == name.lastIndexOf(" ");
		// }
	}
	

}
