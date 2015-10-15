import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class AnagramTester {
	String w1;
	String w2;
public static void main(String[] args) {
	AnagramTester run = new AnagramTester();
	run.run();
}
public void run(){
	setWords();
	printFinish(isItAnAnagram());
}
public boolean isItAnAnagram(){
	/*
	 * Checks if it is an anagram, returns true if it is and false if it is not
	 * 1) Turns them in to arrays
	 * 2)checks if the length is diffrent
	 * 3) Sorts the arrays
	 * 4) Compars the arrays if they are the same
	 */
	char[]letters1 = w1.toCharArray();
	char[]letters2 = w2.toCharArray();
	if (letters1.length != letters2.length) {
		return false;
	}
	Arrays.sort(letters1);
	Arrays.sort(letters2);
	return Arrays.equals(letters1, letters2);
	
}
public void setWords(){
	/*
	 * Asks for user input
	 * Does one after the other
	 */
	w1 = JOptionPane.showInputDialog("Word 1");
	w2 = JOptionPane.showInputDialog("Word 2");
}
public void printFinish(boolean result) {
	/*
	 * Prints out if it is an anagram or not
	 * The first is if it is, the second one if it is not
	 */
	if(result){
		JOptionPane.showMessageDialog(null, "Anagrams");
	} else if(!result){
		JOptionPane.showMessageDialog(null, "Not Anagrams");
	}
	
}

}
