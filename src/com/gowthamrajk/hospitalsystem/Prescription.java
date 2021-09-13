package com.gowthamrajk.hospitalsystem;

import java.util.List;
import java.util.ArrayList;

public class Prescription {
	
	private int prescriptionId;
	private String prescriptionDetails;
	private int patientId;
	private int doctorId;
	private String diseaseName;
	private String prescriptionDate;
	private List<Medicine> medicines = new ArrayList<>();
	
	public Prescription(int prescriptionId, String prescriptionDetails, int patientId, int doctorId,
			String diseaseName, String prescriptionDate) {
		
		this.prescriptionId = prescriptionId;
		this.prescriptionDetails = prescriptionDetails;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.diseaseName = diseaseName;
		this.prescriptionDate = prescriptionDate;
	}
	
	public void addNewMedicine(Medicine medicine)
	{
		this.medicines.add(medicine);
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getPrescriptionDetails() {
		return prescriptionDetails;
	}

	public void setPrescriptionDetails(String prescriptionDetails) {
		this.prescriptionDetails = prescriptionDetails;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getPrescriptionDate() {
		return prescriptionDate;
	}

	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		
		return "Prescription Details => Prescription ID : " + prescriptionId + ", Details : " + prescriptionDetails
				+ ", Patient ID : " + patientId + ", Doctor ID : " + doctorId + ", Disease : " + diseaseName
				+ ", Date of Prescription : " + prescriptionDate 
				+ ",\n\nFollowing are the Medicines prescribed by your doctor => \n" + medicines + "\n";
	}
}