package com.gowthamrajk.hospitalsystem;

public class Appointment {
	
	private int appointmentId;
	private int patientId;
	private String patientName;
	private String appointmentTime;
	private int doctorId;
	private String description;
	
	public Appointment(int appointmentId, int patientId, String patientName, String appointmentTime, int doctorId, 
			String description) {
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentTime = appointmentTime;
		this.doctorId = doctorId;
		this.description = description;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
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

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		
		return "\nAppointment Details => Appointment ID : " + patientId + ", Name : " + patientName + ", Time : "
				+ appointmentTime + ", Doctor ID : " + doctorId + ", Description : " + description + "\n";
	}
}