package Homework17_Advanced.Homework17_Advanced;

public class University {
	
    private String name;
    private String accreditationLevel;
    private int numberOfInstitutes;
    private int numberOfStudents;
    private String address;

    public University(String name, String accreditationLevel, int numberOfInstitutes, int numberOfStudents, String address) {
        this.name = name;
        this.accreditationLevel = accreditationLevel;
        this.numberOfInstitutes = numberOfInstitutes;
        this.numberOfStudents = numberOfStudents;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("University Name: " + name);
        System.out.println("Accreditation Level: " + accreditationLevel);
        System.out.println("Number of Institutes: " + numberOfInstitutes);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        University university = new University(
            "Університет Java Eclipse",
            "Національний",
            10,
            15000,
            "м. Львів, вул. Професорська, 123"
        );

        university.displayInfo();
    }
}
