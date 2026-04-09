package university;
import java.util.ArrayList;
public class Course{
    private final String name;
    private final double fees;
    private ArrayList<Student> studentsEnrolled=new ArrayList<>();

    public Course(String name, double fees){
        this.name=name;
        this.fees=fees;
    }

    public void addStudent(Student student){
        if(!this.studentsEnrolled.contains(student)){
            this.studentsEnrolled.add(student);
        }
    }

    public String getName(){
        return this.name;
    }

    public double getFees(){
        return this.fees;
    }

    public void displayInfo(){
        System.out.println("Course title : "+this.name);
        System.out.println("Course fees : "+this.fees);
        System.out.println("Students enrolled : ");
        this.displayStudents();
    }

    public void displayStudents(){
        if(this.studentsEnrolled.isEmpty()){
            System.out.println("No students enrolled in "+this.name+" at the moment.\n");
        }
        else{
            for(Student s : studentsEnrolled){
                System.out.println(s.getName());
            }
        }
        System.out.println("\n");
    }
}