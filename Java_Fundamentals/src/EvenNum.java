import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input a number::");
		int c = 0;
		try {
			c = Integer.parseInt(reader.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input is not a number!!");
		}
		reader.close();
		for(int i = c; i > 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
