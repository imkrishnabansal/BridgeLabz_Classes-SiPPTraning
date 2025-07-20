package AcessModefier;

public class Student {
    public int rollno;
    protected String name;
    private  int cgpa;

    public Student(int rollno, String name, int cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
       if(cgpa>=0.0&&cgpa<=10.0){
        this.cgpa =cgpa;
       }
       else{
        System.out.println("Invalid cgpa");
       }
    }
    public void diplayDetailsOFStudent(){
        System.out.println("Rollno :" +rollno );
        System.out.println("name :" + name);
        System.out.println("CGPA :" + cgpa);
    }

    
    
}
