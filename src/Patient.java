import javax.print.Doc;

/**
 * This is the Patient class that is used to create a Patient object by inheriting name from the Person object
 */
public class Patient extends Person{

    // Private variables for the Patient class
    private Doctor primaryPhysician;

    // Default Constructor for the Patient class
    public Patient() {
        super();
        primaryPhysician = new Doctor();
    }

    // Non-default Constructor for the Patient class
    public Patient(String name, Doctor primaryPhysician) {
        super(name);
        if (name == null || primaryPhysician == null) {
            System.out.println("Error creating a patient");
            System.exit(0);
        }
        this.primaryPhysician = primaryPhysician;
    }

    // Copy Constructor for the Patient class
    public Patient(Patient aPatient) {
        super(aPatient);
        if (aPatient == null) {
            System.out.println("Error creating a patient");
            System.exit(0);
        }
        this.primaryPhysician = aPatient.primaryPhysician;
    }

    // Getters & Setters for the Patient class
    public Doctor getPrimaryPhysician() {return primaryPhysician;}

    public void setPrimaryPhysician(Doctor primaryPhysician) {
        if (primaryPhysician == null) {
            System.out.println("Invalid Doctor");
            System.exit(0);
        }
        this.primaryPhysician = primaryPhysician;
    }

    // ToString method for the Patient class
    public String toString() {
        return super.toString() + ", Primary doctor is: " + getPrimaryPhysician().getName();
    }

    /**
     * This is the equals method for the Patient class that is used to compare two patient object and determine whether
     * they are equal or not
     * @param aPatient Patient
     * @return boolean
     */
    public boolean equals(Patient aPatient) {
        return (super.equals(aPatient) && getPrimaryPhysician().equals(aPatient.getPrimaryPhysician()));
    }
}
