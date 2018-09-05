import java.util.Scanner;

public class Alphabet {

	public static void main(String []args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input a single character::");
		char c = reader.next().charAt(0);
		reader.close();
		int ascii = (int) c;
		if((ascii >= 65 && ascii <=90) || (ascii >= 97 && ascii <=122)) {
			System.out.println("Entered Char is an Alphabet.");
		}else {
			System.out.println("Sorry! The First entered character is not an Alphabet. Try Again");
			return;
		}
		switch(c) {
			case 'A' :
			case 'a' :
			case 'E' :
			case 'e' :
			case 'I' :
			case 'i' :
			case 'O' :
			case 'o' :
			case 'U' :
			case 'u' :
				System.out.println("Vowel");
				break;
			default :
				System.out.println("Consonant");
		}
	}
	
}
