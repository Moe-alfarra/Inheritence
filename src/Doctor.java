import java.util.Date;

/**
 * This is the Doctor class that is used to create a Doctor object by inheriting salary from the SalariedEmployee class
 * which inherits hireDate from the Employee class, which inherits name from the Person class
 */
public class Doctor extends SalariedEmployee{

    // Private variables for the Doctor class
    private String specialty;
    private double fee;

    // Default Constructor for the Doctor class
    public Doctor() {
        super();
        specialty = "none";
        fee = 0.0;
    }

    // Non-default Constructor for the Doctor class
    public Doctor(String name, Date hireDate, double salary, String specialty, double fee) {
        super(name, hireDate, salary);
        if (specialty == null || fee < 0) {
            System.out.println("Error creating a doctor");
            System.exit(0);
        }
        this.specialty = specialty;
        this.fee = fee;
    }

    // Copy Constructor for the Doctor class
    public Doctor(Doctor aDoctor) {
        super(aDoctor);
        if (aDoctor == null) {
            System.out.println("Error creating a doctor");
            System.exit(0);
        }
        this.specialty = aDoctor.specialty;
        this.fee = aDoctor.fee;
    }

    // Getters & Setters for the Doctor class
    public String getSpecialty() {return specialty;}
    public double getFee() {return fee;}

    public void setSpecialty(String specialty) {
        if (specialty == null) {
            System.out.println("Invalid specialty");
            System.exit(0);
        }
        this.specialty = specialty;
    }

    public void setFee(double fee) {
        if (fee < 0) {
            System.out.println("Invalid fee");
            System.exit(0);
        }
        this.fee = fee;
    }

    // ToString method for the Doctor class
    public String toString() {
        return "The doctor " + super.getName() + super.toString()
                + "\nThe specialty is " + getSpecialty() + " and visit fee is $" + getFee() + ".";
    }

    /**
     * This is the equals method for the Doctor class that is used to compare two Doctor objects and return whether they
     * are equal or not
     * @param aDoctor Doctor
     * @return boolean
     */
    public boolean equals(Doctor aDoctor) {
        return (super.equals(aDoctor) && getSpecialty().equals(aDoctor.getSpecialty()) &&
                getFee() == aDoctor.getFee());
    }
}
