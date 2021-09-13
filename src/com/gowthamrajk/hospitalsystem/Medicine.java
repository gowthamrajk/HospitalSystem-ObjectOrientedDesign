package com.gowthamrajk.hospitalsystem;

public class Medicine {
	
	private int medicineId;
	private String medicineName;
	private double medicineCost;
	private int quantity;
	private String medicineType;
	private String medicineDescription;
	
	public Medicine(int medicineId, String medicineName, double medicineCost, int quantity, String medicineType,
			String medicineDescription) {

		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineCost = medicineCost;
		this.quantity = quantity;
		this.medicineType = medicineType;
		this.medicineDescription = medicineDescription;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public double getMedicineCost() {
		return medicineCost;
	}

	public void setMedicineCost(double medicineCost) {
		this.medicineCost = medicineCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMedicineType() {
		return medicineType;
	}

	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	@Override
	public String toString() {
		
		return "\nMedicine Details => Id : " + medicineId + ", Name : " + medicineName + ", Cost : "
				+ medicineCost + ", Quantity : " + quantity + ", Type : " + medicineType + ", Description : "
				+ medicineDescription + "\n";
	}
}