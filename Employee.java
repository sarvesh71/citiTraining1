class Employee{
	String empName;
	int empId;
	static int empCount = 0;

	public Employee(){
		empCount++;
	}
	public Employee(String name, int id){
		empName=name;
		empId=id;
		empCount++;
	}

	void setEmpName(String name){
		empName=name;
	}
	void setEmpId(int id){
		empId=id;
	}
	String getEmpName(){
		return empName;
	}
	int getEmpId(){
		return empId;
	}

	void displayEmployee(){
		System.out.println("Emp Name:: "+empName+"\tEmp id::"+Integer.toString(empId));
	}
	static void showCount(){
		System.out.println("Total Employees:: "+Integer.toString(empCount));
	}

	public static void main(String []args){
		Employee e1 = new Employee("Sarvesh", 1);
		Employee e2 = new Employee("Sakshi", 2);
		Employee e3 = new Employee("Rahul", 3);
		Employee e4 = new Employee("Himanshu", 4);

		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		e4.displayEmployee();

		showCount();
	}
}