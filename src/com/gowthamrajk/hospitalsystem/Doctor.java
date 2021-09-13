package com.gowthamrajk.hospitalsystem;

import java.util.List;
import java.util.ArrayList;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String specialization;
	private long mobile;
	private int workingExperience;
	private List<Patient> patients = new ArrayList<>();
	private List<Appointment> appointments = new ArrayList<>();
	
	Doctor() { }
	
	public Doctor(int doctorId, String doctorName, String specialization, long mobile,
			int workingExperience) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.mobile = mobile;
		this.workingExperience = workingExperience;
	}
	
	public void addNewPatient(Patient patient)
	{
		this.patients.add(patient);
	}
	
	public void addNewAppointment(Appointment appointment)
	{
		this.appointments.add(appointment);
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getWorkingExperience() {
		return workingExperience;
	}

	public void setWorkingExperience(int workingExperience) {
		this.workingExperience = workingExperience;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public void printPatientDetails(Doctor doctor)
	{
		for(Patient patientObj : patients) {
			if(patientObj.getDoctor().getDoctorName().equalsIgnoreCase(doctor.getDoctorName())) {
				System.out.println("Patient Id : " + patientObj.getPatientId() + ", Name : " 
			    + patientObj.getPatientName() + ", Type : " + patientObj.getPatientType() + ", Age : " 
			    + patientObj.getAge() + ", Problem : " + patientObj.getProblem() + "\n");
			}
		}
	}

	@Override
	public String toString() {
		
		return "\nDoctor Details => ID : " + doctorId + ", Name : " + doctorName + ", specialization : " + specialization
				+ ", mobile : " + mobile + ", Working Experience : " + workingExperience + " years,"
				+ ",\n\nFollowing are your Appointments details => \n" + getAppointments() + "\n";
	}
	
}