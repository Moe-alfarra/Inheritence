import javax.print.Doc;

/**
 * This is the Billing class that is used to create a Billing object
 */
public class Billing {

    // Private variables for the Billing class
    private Patient aPatient;
    private Doctor aDoctor;
    private double amountDue;

    // Default constructor for the Billing class
    public Billing() {
        aPatient = new Patient();
        aDoctor = new Doctor();
        amountDue = 0.0;
    }

    // Non-default constructor for the Billing class
    public Billing(Patient aPatient, Doctor aDoctor, double amountDue) {
        if (aPatient == null || aDoctor == null || amountDue < 0) {
            System.out.println("Error creating bill");
            System.exit(0);
        }
        this.aPatient = aPatient;
        this.aDoctor = aDoctor;
        this.amountDue = amountDue;
    }

    // Copy constructor for the Billing class
    public Billing(Billing aBilling) {
        if (aBilling == null) {
            System.out.println("Error creating bill");
            System.exit(0);
        }
        this.aPatient = aBilling.aPatient;
        this.aDoctor = aBilling.aDoctor;
        this.amountDue = aBilling.amountDue;
    }

    // Getters & Setters for the Billing class
    public Patient getaPatient() {return aPatient;}
    public Doctor getaDoctor() {return aDoctor;}
    public double getAmountDue() {return amountDue;}

    public void setaPatient(Patient aPatient) {
        if (aPatient == null) {
            System.out.println("Invalid Patient");
            System.exit(0);
        }
        this.aPatient = aPatient;
    }

    public void setaDoctor(Doctor aDoctor) {
        if (aDoctor == null) {
            System.out.println("Invalid Doctor");
            System.exit(0);
        }
        this.aDoctor = aDoctor;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) {
            System.out.println("Invalid amount due");
            System.exit(0);
        }
        this.amountDue = amountDue;
    }

    // ToString method for the Billing class
    public String toString() {
        return "Patient: " + aPatient.getName() + "\nDoctor: " + aDoctor.getName() + "\nAmount Due: $" + getAmountDue();
    }

    /**
     * This is the equals method for the Billing class that is used to compare two Billing objects and determine whether
     * they are equal or not
     * @param aBilling Billing
     * @return boolean
     */
    public boolean equals(Billing aBilling) {
        return (getaPatient().equals(aBilling.getaPatient()) && getaDoctor().equals(aBilling.getaDoctor()) &&
                getAmountDue() == aBilling.getAmountDue());
    }
}
