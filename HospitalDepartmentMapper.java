import java.util.*;
class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}
public class HospitalDepartmentMapper {
    public static void main(String[] args) {
        Map<String, List<Doctor>> departmentMap = new HashMap<>();
        departmentMap.put("Cardiology", Arrays.asList(new Doctor("Dr. A", "Heart"), new Doctor("Dr. B", "Heart")));
        departmentMap.put("Neurology", Arrays.asList(new Doctor("Dr. C", "Brain"), new Doctor("Dr. D", "Brain")));
        departmentMap.put("Orthopedics", Arrays.asList(new Doctor("Dr. E", "Bones")));

        System.out.println("Doctors in Cardiology: " + departmentMap.get("Cardiology"));

        // Filter by specialization
        String specialization = "Brain";
        System.out.println("Doctors specialized in " + specialization + ":");
        for (List<Doctor> doctors : departmentMap.values()) {
            for (Doctor doctor : doctors) {
                if (doctor.specialization.equals(specialization)) {
                    System.out.println(doctor);
                }
            }
        }
    }
}