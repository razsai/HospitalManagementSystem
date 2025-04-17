// Linked List implementation to manage patients
public class PatientRecords {
    Patient head;

    // Add a new patient to the list
    public void addPatient(Patient newPatient) {
        newPatient.next = head;  // Connect new patient to current head
        head = newPatient;       // Update head to the new patient
    }

    // Display all patient records including their medical history
    public void displayPatients() {
        if (head == null) {
            System.out.println("There is no patient.");
            return;
        }

        for (Patient p = head; p != null; p = p.next) {
            System.out.println("ID: " + p.ID + " - NAME: " + p.Name + " - AGE: " + p.Age);
            p.displayHistory();  // Show medical history
        }
    }

    // Update patient info by ID
    public void updatePatient(int id, String newName, int newAge, String newContact) {
        for (Patient p = head; p != null; p = p.next) {
            if (p.ID == id) {
                p.Name = newName;
                p.Age = newAge;
                p.contactinfo = newContact;
                System.out.print("Patient updated: " + p.Name + ", " + p.Age + ", " + p.contactinfo);
                return;
            }
        }
        System.out.println("Patient with ID " + id + " not found.");
    }

    // Remove a discharged patient by ID
    public void removePatient(int id) {
        if (head == null) {
            System.out.println("No patient to remove");
            return;
        }

        if (head.ID == id) {
            head = head.next;
            System.out.println("Patient with ID " + id + " removed.");
            return;
        }

        Patient current = head;
        while (current.next != null) {
            if (current.next.ID == id) {
                current.next = current.next.next;
                System.out.println("Patient with ID " + id + " removed.");
                return;
            }
            current = current.next;
        }

        System.out.println("Patient with ID " + id + " not found.");
    }
}