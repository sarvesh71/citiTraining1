class Medicine{
	String medicineName;
	double medicinePrice;

	public Medicine(){
		System.out.println("Default Constructor called");
	}
	public Medicine(String name, double price){
		medicinePrice = price;
		medicineName = name;
		//System.out.println("Parameters set");
	}

	String getMedicineName(){
		return medicineName;
	}
	double getMedicinePrice(){
		return medicinePrice;
	}
	void displayMedicine(){
		System.out.println("Medicine Name:: "+medicineName+"\tMedicine PRICE::"+Double.toString(medicinePrice));
	}

	public void setMedicineName(String name){
		medicineName = name;
	}
	public void setMedicinePrice(double price){
		medicinePrice = price;
	}

	public static void main(String []args){
		Medicine m1 = new Medicine("Cetrizine", 50.5);
		Medicine m2 = new Medicine("SUMO", 25.6);
		m1.displayMedicine();
		m2.displayMedicine();
		System.out.println("Changing m2 Price.");
		m2.setMedicinePrice(35.5);
		m1.displayMedicine();
		m2.displayMedicine();
	}
}