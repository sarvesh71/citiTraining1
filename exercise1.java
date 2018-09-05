class exercise1{
	String name;
	int age;

	void setName(String nm){
		name = nm;
	}
	void setAge(int a){
		age = a;
	}

	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}

	void showEmployeeDetails(){
		System.out.println("Employee Name:: "+name+"\tEmployee age::"+Integer.toString(age));
	}

	public static void main(String []args){
		exercise1 employee1 = new exercise1();
		employee1.setName("abc");
		employee1.setAge(45);
		employee1.showEmployeeDetails();
	}

}