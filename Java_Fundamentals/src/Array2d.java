import java.util.Random;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x  = {1,2,3,4,5};
		int y[] = x;
		System.out.println("Y2"+ y[2]);
		int[][] a =  new int[2][2];
		int[][] b =  new int[2][2];
		Random rand = new Random();
		
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				a[i][j] = rand.nextInt(50)+1;
				b[i][j] = rand.nextInt(25)+1;
			}
		}
		
		int[][] sub =  new int[2][2];
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				sub[i][j] = a[i][j] - b[i][j];
				System.out.print(sub[i][j]+"\t");
			}
			System.out.println("");
		}
		
		
	}

}
