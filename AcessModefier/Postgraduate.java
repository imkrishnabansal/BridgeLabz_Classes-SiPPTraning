package AcessModefier;
// subclass of student
public class Postgraduate extends Student {
    private String specilization;

    public Postgraduate(int rollno, String name, int cgpa,String specilization) {
        super(rollno, name, cgpa);
        this.specilization = specilization;
    }
    public void display(){
         System.out.println("Roll Number: " + rollno);      // public
        System.out.println("Name (Protected Access): " + name); // protected accessed in subclass
        System.out.println("Specialization: " + specilization);
        System.out.println("CGPA (Accessed via Method): " + getCgpa());
    }
}
