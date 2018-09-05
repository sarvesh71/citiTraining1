
public class Student {
	int rollNum;
	String name, address;
	int std, age;
	
	public Student(){}
	public Student(int rnum, String nam, String adrs, int clas, int yrs) {
		rollNum = rnum;
		name = nam;
		address = adrs;
		std = clas;
		age = yrs;
	}
	public void showDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Roll Number: "+ rollNum);
		System.out.println("Address: "+ address);
		System.out.println("Standard: "+ std);
		System.out.println("Age: "+ age);
	}
}
