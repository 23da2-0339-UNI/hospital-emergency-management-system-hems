public class Patient {

    // Basic fields to store patient information
    private int patientId;
    private String name;
    private int age;
    private String condition;
    private String arrivalTime;

    // Constructor - runs when we create a new Patient
    public Patient(int patientId, String name, int age, String condition, String arrivalTime) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.arrivalTime = arrivalTime;
    }

    // Getters - let other classes read the patient's details
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    // toString - lets us easily print out patient details
    @Override
    public String toString() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age +
                ", Condition: " + condition +
                ", Arrival Time: " + arrivalTime;
    }
}
