import java.util.Scanner;
import java.util.stream.*;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input the array size::");
		int n = 0;
		try {
			n = Integer.parseInt(reader.nextLine());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Input is not a number!!");
		}
		int[] numbers = new int[n];
		
		for(int i = 0; i <n; i++) {
			System.out.println("Please input a number::");
			numbers[i] = Integer.parseInt(reader.nextLine());
		}
		reader.close();
		int sum = IntStream.of(numbers).sum();
		System.out.println("The sum is " + sum);
		System.out.println("The avg is " + (double)sum/n);
		System.out.println("Numbers less than average:: ");
		for(int var: numbers) {
			if((double)var < (double)sum/n) {
				System.out.println(var);
			}
		}
		
		
		
	}

}
