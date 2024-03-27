import java.io.*;
import java.util.*;
import java.util.Scanner;
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Doctor extends Person {
    String specialization;
    String qualification;

    public Doctor(String name, String specialization, String qualification) {
        super(name);
        this.specialization = specialization;
        this.qualification = qualification;
    }
}

class Patient extends Person {
    String gender;
    String disease;
    boolean admitStatus;

    public Patient(String name, String gender, String disease, boolean admitStatus) {
        super(name);
        this.gender = gender;
        this.disease = disease;
        this.admitStatus = admitStatus;
    }
}

class Medicine {
    String name;
    String companyName;
    String expiryDate;

    public Medicine(String name, String companyName, String expiryDate) {
        this.name = name;
        this.companyName = companyName;
        this.expiryDate = expiryDate;
    }
}

class LabFacility {
    String name;

    public LabFacility(String name) {
        this.name = name;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Medicine> medicines = new ArrayList<>();
        ArrayList<LabFacility> labFacilities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            Doctor doc1 = new Doctor("Dr. Pankaj", "Cardiologist", "MD");
            Doctor doc2 = new Doctor("Dr. Batra", "Dermatologist", "MBBS");
            Doctor doc3 = new Doctor("Dr. Ruta", "Physician", "MD");
            Doctor doc4 = new Doctor("Dr. Bhavesh", "Gastrologist", "MD");
            Doctor doc5 = new Doctor("Dr. Dhaval Seth", "Orthopaedic", "MPT");
            Doctor doc6 = new Doctor("Dr. Samir", "Pediatrician", "MD");
            Doctor doc7 = new Doctor("Dr. Ankita Jain", "Dentist", "BDS");
            doctors.add(doc1);
            doctors.add(doc2);
            doctors.add(doc3);
            doctors.add(doc4);
            doctors.add(doc5);
            doctors.add(doc6);
            doctors.add(doc7);

            Patient patient1 = new Patient("Suresh", "Male", "Dengue", true);
            Patient patient2 = new Patient("Sujal", "Male", "Broken Arm", false);
            Patient patient3 = new Patient("Nirmal", "Male", "Cancer", true);
            Patient patient4 = new Patient("Kushal", "Male", "Cold", false);
            Patient patient5 = new Patient("Mukeshbhai", "Male", "Malaria", true);
            Patient patient6 = new Patient("Shivani", "Female", "TB", true);
            patients.add(patient1);
            patients.add(patient2);
            patients.add(patient3);
            patients.add(patient4);
            patients.add(patient5);
            patients.add(patient6);

            Medicine med1 = new Medicine("Aspirin", "Pharma Inc.", " 25-9-2023");
            Medicine med2 = new Medicine("Paracetamol", "MedCo", "14-8-2025");
            Medicine med3 = new Medicine("Esomeprazole", "Pharma Inc.", "25-9-2024");
            Medicine med4 = new Medicine("Crocin", "MedCo", "14-8-2025");
            Medicine med5 = new Medicine("Azithromycin", "MedCo", "14-8-2025");
            Medicine med6 = new Medicine("Morphine", "MedCo", "14-8-2025");
            Medicine med7 = new Medicine("Dolo", "MedCo", "14-8-2025");
            medicines.add(med1);
            medicines.add(med2);
            medicines.add(med3);
            medicines.add(med4);
            medicines.add(med5);
            medicines.add(med6);
            medicines.add(med7);

            LabFacility xray = new LabFacility("X-ray");
            LabFacility mri = new LabFacility("MRI");
            LabFacility ctscan = new LabFacility("CT-scan");
            LabFacility bloodBank = new LabFacility("Blood Bank");
            LabFacility sonography = new LabFacility("Sonography");

            labFacilities.add(xray);
            labFacilities.add(mri);
            labFacilities.add(ctscan);
            labFacilities.add(bloodBank);
            labFacilities.add(sonography);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                           Welcome to Apollo Hospital");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        int choice;
        int status=1;
        while (status==1) 
        {
            System.out.println("\n                                               Menu:");
            System.out.println("                                      1. Doctor  Information ");
            System.out.println("                                      2. Patient");
            System.out.println("                                      3. Medical Information");
            System.out.println("                                      4. Lab Facility");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                      DOCTOR SECTION");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("1.Add New Entry\n2.Existing Doctors List");
                    int c1 = scanner.nextInt();
                    switch (c1) {
                        case 1: {
                            System.out.println("Enter Doctor Information:");
                            System.out.print("Name: ");
                            String docName = scanner.next();
                            System.out.print("Specialization: ");
                            String specialization = scanner.next();
                            System.out.print("Qualification: ");
                            String qualification = scanner.next();
                            Doctor doctor = new Doctor(docName, specialization, qualification);
                            doctors.add(doctor);
                            break;
                           
                        }
                        case 2: {
                            System.out.println("Doctors:");
                            for (Doctor doc : doctors) {
                                System.out.println("Name: " + doc.name);
                                System.out.println("Specialization: " + doc.specialization);
                                System.out.println("Qualification: " + doc.qualification);
                                System.out.println();
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                     PATIENT SECTION");
                    System.out.println(
                            "--------------------------------------------------------------------------------");

                    System.out.println("1.Add New Entry\n2.Existing Patients List");
                    int c3 = scanner.nextInt();
                    switch (c3) {
                        case 1: {
                            System.out.println("Enter Patient Information:");
                            System.out.print("Name: ");
                            String patientName = scanner.next();
                            System.out.print("Gender: ");
                            String gender = scanner.next();
                            System.out.print("Disease: ");
                            String disease = scanner.next();
                            System.out.print("Admit Status (true/false): ");
                            boolean admitStatus = scanner.nextBoolean();
                            Patient patient = new Patient(patientName, gender, disease, admitStatus);
                            patients.add(patient);
                            break;

                        }
                        case 2: 
                            System.out.println("Patients:");
                            for (Patient pat : patients) {
                                System.out.println("Name: " + pat.name);
                                System.out.println("Gender: " + pat.gender);
                                System.out.println("Disease: " + pat.disease);
                                System.out.println("Admit Status: " + (pat.admitStatus ? "Admitted" : "Not Admitted"));
                                System.out.println();
                            }

                            break;
                    }
                    break;

                case 3:
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                     MEDICINE SECTION");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    int c2 = scanner.nextInt();
                    switch (c2) {
                        case 1: {
                            System.out.print("Name: ");
                            String Name = scanner.next();
                            System.out.print("Company Name: ");
                            String company = scanner.next();
                            System.out.print("Expiry date: ");
                            String ed = scanner.next();
                            Medicine patient = new Medicine(Name, company, ed);
                            medicines.add(patient);
                            break;

                        }
                        case 2: {
                            System.out.println("Medicines :");
                            for (Medicine medicine : medicines) {
                                System.out.println("Name: " + medicine.name);
                                System.out.println("Company Name: " + medicine.companyName);
                                System.out.println("Expiry Date: " + medicine.expiryDate);
                                System.out.println();
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Lab Facilities:");
                    for (LabFacility facility : labFacilities) {
                        System.out.println("Name: " + facility.name);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.print("To Exit MENU Press 0  else  1: ");
            status = scanner.nextInt();
            if(status==0){
                    System.out.println("Have a nice Day !");
            }
        }
    }
}