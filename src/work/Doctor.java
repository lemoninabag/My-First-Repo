package work;  // Declare the package name "work" for this Java file.

import java.util.InputMismatchException;  // Import the InputMismatchException class.
import java.util.Scanner;  // Import the Scanner class for user input.

public class Doctor {

    public String doctorname;  // Declare a public variable to store the doctor's name.
    public String doctorspecialization;  // Declare a public variable to store the doctor's specialization.

    public int doctorID;  // Declare a public variable to store the doctor's ID.
    public int doctornumber;  // Declare a public variable to store the doctor's phone number.

    // Method to add doctor information.
    void add_doctors() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read user input.
        try {
            System.out.println("Enter the doctor's ID: ");
            if (scanner.hasNextInt()) {  // Check if the input is an integer.
                doctorID = scanner.nextInt();  // Store the entered integer as the doctor's ID.
                scanner.nextLine();  // Consume the newline character after the integer input.
            } else {
                throw new InputMismatchException();  // Throw an exception if input is not an integer.
            }

            System.out.println("Enter the doctor's name: ");
            doctorname = scanner.nextLine();  // Store the entered line as the doctor's name.

            System.out.println("Enter the doctor's specialization: ");
            doctorspecialization = scanner.nextLine();  // Store the entered line as the doctor's specialization.

            System.out.println("Enter the phone number: ");
            if (scanner.hasNextInt()) {  // Check if the input is an integer.
                doctornumber = scanner.nextInt();  // Store the entered integer as the doctor's phone number.
            } else {
                throw new InputMismatchException();  // Throw an exception if input is not an integer.
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            scanner.close();  // Close the scanner in the finally block to prevent resource leaks.
        }
    }

    // Method to display doctor information.
    void Doctor_info() {
        System.out.println(doctorID + " " + doctorname + " " + doctorspecialization + " " + doctornumber);
    }
}


	  