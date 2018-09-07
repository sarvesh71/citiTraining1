import java.lang.Math;

public class OverloadProgram {
	//Area for circle
	double area(double radius) {
		return Math.PI*radius*radius;
	}
	
	//Area for rectangle/square
	double area(double length, double breadth) {
		return length*breadth;
	}
	
	//Area for triangle with three sides
	double area(double s1, double s2, double s3) {
		double s = (s1+s2+s3)/2;
		return Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
	}
}
