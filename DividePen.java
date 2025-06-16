public class DividePen {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;   // Equal pens per student
        int remainingPens = totalPens % students;    // Pens left

        System.out.println("Each student will get " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);

    }
}
