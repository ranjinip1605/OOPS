class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Name: " +name);
    }
}

class Doctor extends Person {
    int experience;
    String specialization;

    Doctor(String name, int experience, String specialization) {
        super(name);
        this.experience = experience;
        this.specialization = specialization;
    }

    void displayDoctorInfo() {
        System.out.println("Doctor Details: ");
        displayName();
        System.out.println("Experience: " +experience+ " years");
        System.out.println("Specialization: " +specialization);
    }
}

class Patient extends Person {
    String problem;

    Patient(String name, String problem) {
        super(name);
        this.problem = problem;
    }

    void displayPatientInfo() {
        System.out.println("Patient Details: ");
        displayName();
        System.out.println("Problem: " +problem);
    }
}