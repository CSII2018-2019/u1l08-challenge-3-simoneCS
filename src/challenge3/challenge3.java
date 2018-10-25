package challenge3;

import javax.swing.JOptionPane;

public class challenge3 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(" Enter a word ");
		char [] charArray = input.toCharArray();
	
		for (int i = 0; i < charArray.length; i++) {

		}
		int matcher = charArray.length;
		int x = 0;
		while (x < (charArray.length)/2) {
			matcher -= 1;
			if (charArray[x] != charArray[matcher]) {
				System.out.println(" Your word is not a palindrome ");
				break;
			}
			else {
				System.out.println( charArray[x] + " matches " 
						+ charArray[matcher]);
			}
			x++;
			if (x == (charArray.length)/2) {
			System.out.println(" Your word is a palindrome yay ");
			}
	
			}
			
		}
}

