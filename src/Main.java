import java.util.Calendar; // Command used to import Calendar
import java.util.Date; // Command used to import Date


/**
 * @author 6368950
 * Title: Assignment 3
 * Description: This is the Main class that is used to run the program which is a test program that creates three doctors,
 * three patients and three billing objects
 *
 */
public class Main {


    public static void main(String[] args) {

        Date aDate = new Date(69, Calendar.DECEMBER, 31,19, 0, 12); // Creates a Date object called aDate


        // Create 3 Doctors

        Doctor aDoctor1 = new Doctor("Bob", aDate, 34000.0, "Pediatrist", 10.5); // Creates a Doctor object called aDoctor1
        Doctor aDoctor2 = new Doctor("Susan", aDate, 450000.0, "Surgeon", 150.5); // Creates a Doctor object called aDoctor2
        Doctor aDoctor3 = new Doctor("Lilly", aDate, 290000.0, "Kidney", 95.5); // Creates a Doctor object called aDoctor3

        // Create 3 Patients

        Patient aPatient1 = new Patient("Fred", aDoctor1); // Creates a Patient object called aPatient1
        Patient aPatient2 = new Patient("Sally", aDoctor2); // Creates a Patient object called aPatient2
        Patient aPatient3 = new Patient("John", aDoctor3); // Creates a Patient object called aPatient3

        // Create 3 Billings

        Billing aBilling1 = new Billing(aPatient1, aDoctor1, 21.0); // Creates a Billing object called aBilling1
        Billing aBilling2 = new Billing(aPatient2, aDoctor2, 150.5); // Creates a Billing object called aBilling2
        Billing aBilling3 = new Billing(aPatient3, aDoctor3, 170.0); // Creates a Billing object called aBilling3

        double totalIncome;

        totalIncome = aBilling1.getAmountDue() + aBilling2.getAmountDue() + aBilling3.getAmountDue(); // Gets the total income by adding the billing amount

        // Prints the 3 doctor objects using the toString

        System.out.println(aDoctor1);
        System.out.println(aDoctor2);
        System.out.println(aDoctor3);



        System.out.println("\n*Patient's Information*");

        // Prints the 3 Patient objects using the toString

        System.out.println(aPatient1);
        System.out.println(aPatient2);
        System.out.println(aPatient3);

        System.out.println("\n*Billing's Information*");

        // Prints the 3 Billing objects using the toString

        System.out.println(aBilling1);
        System.out.println(aBilling2);
        System.out.println(aBilling3);

        // Prints the total income

        System.out.println("\nThe total income from billing records is: " + totalIncome);

    }
}
