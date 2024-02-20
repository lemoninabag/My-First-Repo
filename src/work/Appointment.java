package work;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.DateTimeException;

public class Appointment {

    public String doctorname;
    public String patientname;
    public LocalDate appointmentdate;
    public int appointmentID; 
    public int appointmentday;
    public int appointmentmonth;
    public int appointmentyear;
    public int appointmenttime;

    // Method to add appointment information.
    void add_appointment() {
        Scanner mj = new Scanner(System.in);

        try {
            System.out.println("Enter the appointment ID: ");
            appointmentID = mj.nextInt(); 

            System.out.println("Enter the appointment day: ");
            appointmentday = mj.nextInt();

            System.out.println("Enter the appointment month: ");
            appointmentmonth = mj.nextInt();

            System.out.println("Enter the appointment year: ");
            appointmentyear = mj.nextInt();

            // Create a LocalDate object using the entered date components.
            appointmentdate = LocalDate.of(appointmentyear, appointmentmonth, appointmentday);
        } catch (InputMismatchException ime) {
            System.out.println("Error: Invalid input. Please try again.");
        } catch (DateTimeException dte) {
            System.out.println("Error: Invalid date. Please try again.");
        } finally {
            mj.close(); // Close the scanner to prevent resource leak
        }
    }

    // Method to display appointment information.
    void appointment_info(Patient patient, Doctor doctor) {
        System.out.println(appointmentID + "    " + patient.patientname + "        " + doctor.doctorname + "      " + appointmentdate);
    }
}
