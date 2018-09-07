
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadProgram o1 = new OverloadProgram();
		
		//area of circle with radius 6.5
		System.out.println("area of circle with radius 6.5:: "+Double.toString(o1.area(6.5)));
//		o1.area(6.5);

		//area of rectangle with sides 12.6, 13.8
		System.out.println("area of rectangle with sides 12.6, 13.8:: "+Double.toString(o1.area(12.6, 13.8)));
//		o1.area(12.6, 13.8);
		
		//area of triangle with sides 17.2, 21.34, 15.9
		System.out.println("area of triangle with sides 17.2, 21.34, 15.9:: "+Double.toString(o1.area(17.2, 21.34, 15.9)));
//		o1.area(17.2, 21.34, 15.9);
	}

}
