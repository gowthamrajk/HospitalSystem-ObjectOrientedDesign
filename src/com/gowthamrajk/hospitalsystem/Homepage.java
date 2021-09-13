package com.gowthamrajk.hospitalsystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Homepage {

	public static void main(String[] args) 
	{
		try (Scanner scanner = new Scanner(System.in)) {
			  
			List<Doctor> doctorsList = new ArrayList<>();
			List<Patient> patientList = new ArrayList<>();
			List<Nurse> nurseList = new ArrayList<>();
			Doctor doctor1 = new Doctor(101,"abc","heart",1234567891,10);
			Doctor doctor2 = new Doctor(102,"xyz","ENT",1122334455,15);
			doctorsList.add(doctor1);
			doctorsList.add(doctor2);
			System.out.println("Welcome to Gowthamraj K's Hospital Management Portal :)");
			while(true) {
				
			    System.out.println("choose the option : \n1) Doctor \n2) Patient \n3)Exit");
			    int option = scanner.nextInt();
			    if(option == 1) {
			    	
			    	System.out.println("\nWelcome to Doctor Console Menu !!!");
			    	getPatientsList(doctorsList, scanner);
			    	addPrescription(patientList, scanner);
			    	viewAppointments(doctorsList, scanner);
			    	addNurse(nurseList, scanner);
			    }
			    else if(option == 2) {
			    	
			    	System.out.println("\nWelcome to Patient Console Menu !!!");
			    	addNewPatient(scanner, doctorsList, nurseList, patientList);
			    	bookNewAppointment(scanner, patientList, doctorsList);
			    	getPrescriptions(patientList, scanner);
			    	viewNurseDetails(nurseList, scanner);
			    }
			    else if(option == 3) {
			    	System.out.println("\nThankyou for using the portal !!! Have a good day :)");
			    	break;
			    }
			    else
			    	System.out.println("\nPlease choose a valid option !!!");
			}
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
	}
	
	public static void getPatientsList(List<Doctor> doctorsList, Scanner scanner) {
		System.out.println("Hello Doctor !!!, Please enter your name : ");
		scanner.nextLine();
		String doctorName = scanner.next();
		for(Doctor doctorObj : doctorsList) {
	
			if(doctorObj.getDoctorName().equalsIgnoreCase(doctorName) && doctorObj.getPatients().isEmpty()) {
				System.out.println("You dont have any Patients ryt now...");
				break;
			}
			else if(doctorObj.getDoctorName().equalsIgnoreCase(doctorName)) {
				System.out.println("\nYour Patients are as Follows => ");
				System.out.println(doctorObj);
				System.out.println("Your Patient List : \n");
				doctorObj.printPatientDetails(doctorObj);
			}
		}
	}
	
    public static void addPrescription(List<Patient> patientList, Scanner scanner) {
		
    	System.out.println("Want's to add Prescription ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
			System.out.println("\nEnter the Medicine Details as name, cost, quantity, type, description : ");
			scanner.nextLine();
			String[] medicines = scanner.nextLine().split(",");
	        Medicine medicine = new Medicine(15, medicines[0], Double.parseDouble(medicines[1]), Integer.parseInt(medicines[2]),
	        		medicines[3], medicines[4]);
			
		    System.out.println("\nEnter the Prescription Details as details, patientId, doctorId, disease, date : ");
	        String[] prescriptionDetails = scanner.nextLine().split(",");
	        Prescription prescription = new Prescription(115, prescriptionDetails[0],
	        		Integer.parseInt(prescriptionDetails[1]), Integer.parseInt(prescriptionDetails[2]), 
	        		prescriptionDetails[3], prescriptionDetails[4]);
	        prescription.addNewMedicine(medicine);
	        System.out.println("Prescription Added with Medicine successfully !!!\n" + medicine);
	        
	        for(Patient patientObj : patientList) {
	        	if(patientObj.getPatientId() == prescription.getPatientId()) {
	        		patientObj.addNewPrescription(prescription);
	        		break;
	        	}
	        }
		}
		else
			System.out.println("Skipping to Next option !!!");
	}
	
	public static void viewAppointments(List<Doctor> doctorsList, Scanner scanner) {
		
		System.out.println("Want's to View your appointments ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
			System.out.println("Hello Doctor !!!, Please enter your name : ");
			String doctorName = scanner.next();
			for(Doctor doctorObj : doctorsList) {
		
				if(doctorObj.getDoctorName().equalsIgnoreCase(doctorName) && doctorObj.getAppointments().isEmpty()) {
					System.out.println("You dont have any Appointments ryt now...");
					break;
				}
				else if(doctorObj.getDoctorName().equalsIgnoreCase(doctorName)) {
					System.out.println("\nYour Appointment Summary as Follows => ");
					System.out.println(doctorObj.getAppointments());
				}
			}
		}
		else
			System.out.println("Skipping to Next Task !!!");
		
	}
	
	public static void addNurse(List<Nurse> nurseList, Scanner scanner) {
		
		System.out.println("Want's to add Nurse ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
		    System.out.println("\nEnter the Nurse Details as name, department, experience, patientID, duty period : ");
		    scanner.nextLine();
		    String[] nurseDetails = scanner.nextLine().split(",");
	        Nurse nurse = new Nurse(11, nurseDetails[0], nurseDetails[1], nurseDetails[2],
	        		      Integer.parseInt(nurseDetails[3]), nurseDetails[4]);
	        System.out.println("Nurse Added successfully !!!\n" + nurse);
	        nurseList.add(nurse);
		}
		else
			System.out.println("Skipping to the Next Option !!!");
	}
	
    public static void addNewPatient(Scanner scanner, List<Doctor> doctorsList, List<Nurse> nurseList, List<Patient> patientList) {
    	
    	System.out.println("\nEnter the Patient Details as name, age, problem, doctorName : ");
    	scanner.nextLine();
        String[] patientDetails = scanner.nextLine().split(",");
        Patient patient = new Patient(18, patientDetails[0], Integer.parseInt(patientDetails[1]), patientDetails[2],
        		"IN-Patient", "Not Admitted");
       
        for(Doctor doctorObj : doctorsList) {
        	if(doctorObj.getDoctorName().equalsIgnoreCase(patientDetails[3]))
        	{
        		doctorObj.addNewPatient(patient);
        		patient.setDoctor(doctorObj);
        	}
        }
        
        for(Nurse nurseObj : nurseList) {
        	if(nurseObj.getPatientId() == 18)
        	{
        		patient.setNurse(nurseObj);
        	}
        }
        patientList.add(patient);
        System.out.println("Patient details Added successfully !!!\n" + patient);
	}
    
    public static void bookNewAppointment(Scanner scanner, List<Patient> patientList, List<Doctor> doctorsList) {
    	
    	System.out.println("Want's to Book an appointment ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
			System.out.println("\nEnter Your Appointment Booking Details as name, time, doctorID, description : ");
			scanner.nextLine();
			String[] appointmentDetails = scanner.nextLine().split(",");
	        Appointment appointment = new Appointment(21, 18, appointmentDetails[0], appointmentDetails[1],
	        		Integer.parseInt(appointmentDetails[2]), appointmentDetails[3]);
	        
	        for(Doctor doctorObj : doctorsList) {
	        	if(doctorObj.getDoctorId() == appointment.getDoctorId())
	        	{
	        		doctorObj.addNewAppointment(appointment);
	        	}
	        }
	        
	        for(Patient patientObj : patientList) {
	        	if(patientObj.getPatientId() == appointment.getPatientId())
	        	{
	        		patientObj.addNewAppointment(appointment);
	        	}
	        }
	        System.out.println("Appointment Booked successfully !!!\n" + appointment);
		}
		else
			System.out.println("Skipping to the Next Option !!!");
    }
    
    public static void getPrescriptions(List<Patient> patientList, Scanner scanner) {
    	
    	System.out.println("Want's to View your Prescription List ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
			scanner.nextLine();
			System.out.println("Hello Patient !!!, Please enter your name : ");
			String patientName = scanner.next();
			for(Patient patientObj : patientList) {
		
				if(patientObj.getPatientName().equalsIgnoreCase(patientName) && patientObj.getPrescriptions().isEmpty()) {
					System.out.println("\nYou dont have any Prescriptions ryt now...\n");
					break;
				}
				else if(patientObj.getPatientName().equalsIgnoreCase(patientName)) {
					System.out.println("\nYour Prescription Summary as Follows => ");
					System.out.println(patientObj.getPrescriptions());
				}
			}
		}
		else
			System.out.println("Skipping to the Next Task !!!");
    }
    
    public static void viewNurseDetails(List<Nurse> nurseList, Scanner scanner) {
    	
    	System.out.println("Want's to View your Nurse Details ? (Y/N)");
		char option = scanner.next().charAt(0);
		if(Character.toLowerCase(option) == 'y')
		{
			scanner.nextLine();
			System.out.println("Hello Patient !!!, Please enter your Patient ID : ");
			int patientId = scanner.nextInt();
			if(nurseList.isEmpty())
			    System.out.println("Nurse List is empty !!!\n");
			for(Nurse nurseObj : nurseList) {
		
				if(nurseObj.getPatientId() != patientId) {
					System.out.println("\nYou dont have any Nurse assigned ryt now...\n");
					break;
				}
				else if(nurseObj.getPatientId() == patientId) {
					System.out.println("\nYour Nurse Details is => ");
					System.out.println(nurseObj);
				}
			}
		}
		else
			System.out.println("Skipping to the Next Task !!!");
    }
}