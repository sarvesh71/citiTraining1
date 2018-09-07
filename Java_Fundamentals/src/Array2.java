import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input a number between 1-50::");
		int c = 0;
		try {
			c = Integer.parseInt(reader.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input is not a number!!");
		}
		reader.close();
		if(c<1 || c>50) {
			System.out.println("number not between 1-50. Try Again!!");
			return;
		}
		int[] nums = {10,20,30,40,50};
		for(int i: nums) {
			if(i == c) {
				System.out.println("Number "+c+" found in the Array.");
				return;
			}
		}
		System.out.println("Number "+c+" not found in the Array.");
	}

}
