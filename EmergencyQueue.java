import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyQueue {

    private final PriorityQueue<Patient> patients;

    public EmergencyQueue() {
        patients = new PriorityQueue<>(new SeverityComparator());
    }

    // Main method that adds a full Patient object
    public void addPatient(Patient patient) {
        patients.offer(patient);
    }

    // Optional helper if you want to pass just name/severity
    public void addPatient(String name, int severity) {
        patients.offer(new Patient(name, severity)); // uses global Patient class
    }

    public Patient treatPatient() {
        return patients.poll();
    }

    public void displayQueue() {
        for (Patient p : patients) {
            System.out.println("- " + p.Name + " (Severity: " + p.severity + ")");
        }
    }

    private class SeverityComparator implements Comparator<Patient> {
        @Override
        public int compare(Patient p1, Patient p2) {
            return Integer.compare(p1.severity, p2.severity);
        }
    }
}