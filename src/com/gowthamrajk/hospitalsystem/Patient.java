package com.gowthamrajk.hospitalsystem;

import java.util.ArrayList;
import java.util.List;

public class Patient 
{
	private int patientId;
	private String patientName;
	private int age;
	private String problem;
	private String patientType;
	private String admissionStatus;
	private Doctor doctor;
	private Nurse nurse;
	private List<Appointment> appointments = new ArrayList<>();
	private List<Prescription> prescriptions = new ArrayList<>();
	
	public Patient(int patientId, String patientName, int age, 
			String problem, String patientType, String admissionStatus) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.problem = problem;
		this.patientType = patientType;
		this.admissionStatus = admissionStatus;
	}
	
	public void addNewAppointment(Appointment appointment)
	{
		this.appointments.add(appointment);
	}
	
	public void addNewPrescription(Prescription prescription)
	{
		this.prescriptions.add(prescription);
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getPatientType() {
		return patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public String getAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(String admissionStatus) {
		this.admissionStatus = admissionStatus;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	@Override
	public String toString() {
		
		return "\nPatient Details => ID : " + patientId + ", Name : " + patientName + ", age : " + age
				+ ", problem : " + problem + ", PatientType : " + patientType + ", Admission Status : " 
				+ admissionStatus + ",\n\nYour Doctor information => \n\nDoctor Details => Id : " 
				+ doctor.getDoctorId() + ", Name : " + doctor.getDoctorName() + ", Specialization : " 
				+ doctor.getSpecialization() + ", Experience : " + doctor.getWorkingExperience()
				+ ",\n\nYour specific Appointments => \n" + getAppointments()
				+ ",\n\nYour doctor's Prescription details => \n" + getPrescriptions() 
				+ "\n\nYour nurse details => \n" + nurse + "\n";
	}
}