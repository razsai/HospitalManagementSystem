import java.util.HashMap;
import java.util.Map;

public class DoctorAssignments {

    // HashTable to store doctor ID and the Doctor object
    private final HashMap<Integer, Doctor> table = new HashMap<>();

    // Add a new doctor to the table
    public void addDoctor(int id, String name, String department, String schedule) {
        Doctor newDoctor = new Doctor(id, name, department, schedule);
        table.put(id, newDoctor);
    }

    // Display all doctors
    public void displayDoctors() {
        if (table.isEmpty()) {
            System.out.println("No doctor assignments found.");
        } else {
            for (Map.Entry<Integer, Doctor> entry : table.entrySet()) {
                Doctor d = entry.getValue();
                System.out.println("Doctor ID: " + d.id +
                        ", Name: " + d.name +
                        ", Department: " + d.department +
                        ", Schedule: " + d.schedule);
            }
        }
    }

    // 🔸 Inner Doctor class (used only inside DoctorAssignments)
    private class Doctor {
        int id;
        String name;
        String department;
        String schedule;

        public Doctor(int id, String name, String department, String schedule) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.schedule = schedule;
        }
    }
}