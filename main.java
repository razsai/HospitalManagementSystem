import prostack.TreatmentHistory; // Import TreatmentHistory from the prostack package

public class main {
    public static void main(String[] args) {

        // 1. Test Patient Records
        System.out.println("\n=====================");
        System.out.println("1. Testing Patient Records...");
        System.out.println("=====================");

        PatientRecords patientRecords = new PatientRecords();

        // Create two patients with full details
        Patient p1 = new Patient(101, "Yara", 30, "8741256321");
        Patient p2 = new Patient(102, "Khaled Ali", 25, "8756249851");

        // Add patients to linked list
        patientRecords.addPatient(p1);
        patientRecords.addPatient(p2);

        // Display all patient records
        patientRecords.displayPatients();

        // Update a patient's info and remove another
        patientRecords.updatePatient(101, "Yara", 34, "8887774455");
        patientRecords.removePatient(102);
        patientRecords.displayPatients();

        // 2. Test Emergency Queue
        System.out.println("\n=====================");
        System.out.println("2. Testing Emergency Queue...");
        System.out.println("=====================");

        EmergencyQueue emergencyQueue = new EmergencyQueue();

        // Add emergency patients with severity (lower number = higher priority)
        Patient emergencyp1 = new Patient("Yara", 3);         // Less critical
        Patient emergencyp2 = new Patient("Khaled Ali", 1);   // More critical

        emergencyQueue.addPatient(emergencyp1);
        emergencyQueue.addPatient(emergencyp2);

        // Display queue before treatment
        emergencyQueue.displayQueue();

        // Treat the highest priority patient
        Patient treated = emergencyQueue.treatPatient();
        System.out.println("Treating Patient: " + treated.Name);

        // 3. Test Treatment History
        System.out.println("\n=====================");
        System.out.println("3. Testing Treatment History...");
        System.out.println("=====================");

        TreatmentHistory history = new TreatmentHistory();

        // Add treatment records (stored as a stack)
        history.addTreatment("Surgery on 2025-02-01");
        history.addTreatment("Prescribed Antibiotics");
        history.addTreatment("Annual Checkup");

        // Display treatment history and the most recent treatment
        history.displayHistory();
        System.out.println("Last Treatment: " + history.getLastTreatment());

        // 4. Test Doctor Assignments
        System.out.println("\n=====================");
        System.out.println("4. Testing Doctor Assignments...");
        System.out.println("=====================");

        DoctorAssignments doctors = new DoctorAssignments();

        // Add doctor info
        doctors.addDoctor(201, "Dr. Khalid", "Cardiology", "9AM-5PM");
        doctors.addDoctor(202, "Dr. Sara", "Neurology", "10AM-6PM");

        // Display doctor assignments
        doctors.displayDoctors();

        System.out.println("\n=== System Test Completed ===");
    }
}