package work;

import java.util.*;  // Import the java.util package for Scanner and InputMismatchException.

public class Patient {

    // Declare instance variables to store patient information.
   public String patientname;
   public String patientgender;
   public String patientinsurence;
   public String patientaddress;
   public String patientdiagnosis;

   public int patientID;
   public int patientphoneno;
    public int patientage;  // Add a semicolon at the end.

    // Method to add patient information.
    void add_patients() {
        Scanner MJ = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the Patient ID: ");
                patientID = MJ.nextInt();
                MJ.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input for patient ID. Please enter a valid number.");
                MJ.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Enter the patient's Name: ");
                patientname = MJ.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input for patient name. Please enter a valid string.");
                MJ.nextLine();
            }
        }

        // Similar while loops for other patient information...
    }

    // Method to print a table header.
    public void printTableHeader() {
        System.out.println(String.format("%10s%15s%20s%10s%20s%20s%20s", "Patient ID", "Patient name", "Patient Diagnosis", "Patient Gender", "Patient Address", "Patient Phoneno", "Patient Insurance"));
        System.out.println("----------------------------------------------------------------------------------------");
    }

    // Method to display patient information in a formatted table.
    public void Patient_info() {
        System.out.println(String.format("%-10d%-15s%-20s%-10s%-20s%-20s%-20s", patientID, patientname, patientdiagnosis, patientgender, patientaddress, patientphoneno, patientinsurence));
    }
}
