import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input first integer::");
		int n1 = 0;
		try {
			n1 = Integer.parseInt(reader.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input is not a number!!");
		}
		System.out.println("Please input second integer::");
		int n2 = 0;
		try {
			n2 = Integer.parseInt(reader.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input is not a number!!");
		}
		System.out.println("Please input an Operator(+,-,*,/)::");
		char op = reader.next().charAt(0);
		reader.close();
		switch(op) {
		case '+':
			System.out.println("Result= "+ Integer.toString(n1+n2));
			break;
		case '-':
			System.out.println("Result= "+ Integer.toString(n1-n2));
			break;
		case '*':
			System.out.println("Result= "+ Integer.toString(n1*n2));
			break;
		case '/':
			System.out.println("Result= "+ Integer.toString(n1/n2));
			break;
		default: 
			System.out.println("operator not familiar!!");
		}
	}

}
