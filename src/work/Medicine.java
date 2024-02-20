package work;

import java.util.*; // Import java.util package for Scanner and InputMismatchException.
import java.time.*; // Import java.time package for LocalDate and DateTimeException.

public class Medicine {

    // Declare public instance variables to store medicine information.
    public String medicinename;
    public String madicinecompany;
    public LocalDate medicineexpirydate;
    public int medicineID;
    public int medicineprice; 
    public int medicinequantity;
    Scanner mj = new Scanner(System.in);

    // Method to add medicine information.
    void add_Medicine() {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter the medicine name: ");
                medicinename = mj.nextLine();
                System.out.println("Enter the medicine ID: ");
                medicineID = mj.nextInt();
                mj.nextLine(); // Consume the newline character
                System.out.print("Enter the medicine company: ");
                madicinecompany = mj.nextLine();
                System.out.print("Enter the medicine's expiry date (yyyy-mm-dd): ");
                String expiryDateString = mj.nextLine();
                medicineexpirydate = LocalDate.parse(expiryDateString); // Parse the date string
                System.out.print("Enter the price of the medicine: ");
                medicineprice = mj.nextInt(); 
                System.out.print("Enter the quantity of the medicine: ");
                medicinequantity = mj.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                mj.nextLine(); // Consume the invalid input
            } catch (DateTimeException e) {
                System.out.println("Invalid date format. Please use yyyy-mm-dd.");
                mj.nextLine(); // Consume the invalid input
            } finally {
                // Code to close resources, if any
            }
        }
    }

    // Method to print a formatted header for medicine information and display medicine details.
    public void Medicine_info() {
        System.out.println(String.format("%10s%15s%20s%10s%20s%20s", "Medicine ID", "Medicine name", "Medicine Company", "Medicine Quantity", " Medicine Expiry date", "Medicine Price"));
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(String.format("%10d%15s%20s%10d%20s%20.2f", medicineID, medicinename, madicinecompany, medicinequantity, medicineexpirydate, medicineprice));
    }

    // Method to display medicine details in a simple format.
    void find_Medicine() {
        System.out.println(medicineID + "  " + medicinename + "  " + madicinecompany
                + "   " + medicinequantity + "  " + medicineexpirydate + "   " + medicineprice);
    }
}
