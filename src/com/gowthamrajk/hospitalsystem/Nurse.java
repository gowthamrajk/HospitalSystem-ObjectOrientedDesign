package com.gowthamrajk.hospitalsystem;

public class Nurse {
	
	private int nurseId;
	private String nurseName;
	private String department;
	private String workingExperience;
	private int patientId;
	private String dutyPeriod;
	
	public Nurse(int nurseId, String nurseName, String department, String workingExperience, int patientId,
			String dutyPeriod) {
		
		this.nurseId = nurseId;
		this.nurseName = nurseName;
		this.department = department;
		this.workingExperience = workingExperience;
		this.patientId = patientId;
		this.dutyPeriod = dutyPeriod;
	}

	public int getNurseId() {
		return nurseId;
	}

	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(String workingExperience) {
		this.workingExperience = workingExperience;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getDutyPeriod() {
		return dutyPeriod;
	}

	public void setDutyPeriod(String dutyPeriod) {
		this.dutyPeriod = dutyPeriod;
	}

	@Override
	public String toString() {
		
		return "\nNurse Details => Nurse ID : " + nurseId + ", Name : " + nurseName + ", Department : " + department
				+ ", Experience : " + workingExperience + ", Patient ID : " + patientId + ", Duty Period : " + dutyPeriod
				+ "\n";
	}
}