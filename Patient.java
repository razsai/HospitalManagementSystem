public class Patient {
    // Reusable Patient class (for both Records & Emergency Queue)
    public int ID;
    public String Name;
    public int Age;
    public String contactinfo;
    public int severity;  // Used for EmergencyQueue
    public MedicalHistory historyHead;  // Medical record linked list
    public Patient next;

    // Full constructor for patient records
    public Patient(int id, String name, int age, String contact) {
        this.ID = id;
        this.Name = name;
        this.Age = age;
        this.contactinfo = contact;
        this.historyHead = null;
        this.next = null;
    }

    // Short constructor for EmergencyQueue
    public Patient(String name, int severity) {
        this.Name = name;
        this.severity = severity;
    }

    // Display medical history
    public void displayHistory() {
        System.out.println("Medical history for: " + Name);
        MedicalHistory current = historyHead;
        while (current != null) {
            System.out.println("* " + current.record);
            current = current.next;
        }
    }

    // Add new record to medical history
    public void addHistory(String record) {
        MedicalHistory newRecord = new MedicalHistory(record);
        newRecord.next = historyHead;
        historyHead = newRecord;
    }
}

// ============================================
// Internal class for medical history node
class MedicalHistory {
    String record;
    MedicalHistory next;

    public MedicalHistory(String record) {
        this.record = record;
        this.next = null;
    }
}