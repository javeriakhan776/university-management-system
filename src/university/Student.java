package university;
import java.util.ArrayList;
public class Student{
    private final String name;
    private final String dob;
    private final Contact contact;
    private ArrayList<Course> coursesEnrolled=new ArrayList<>();
    private double dues;
    private boolean duesCleared;

    public Student(String name, String dob, int cell, String username){
        this.name=name;
        this.dob=dob;
        this.contact=new Contact(cell,username);
        this.dues=0;
        this.duesCleared=true;
    }

    public String getName(){
        return this.name;
    }

    public double getDues(){
        return this.dues;
    }

    public void displayInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Date of Birth : "+this.dob);
        System.out.println("Cell no. : "+contact.getCell());
        System.out.println("Email Address : "+contact.getEmail());
        System.out.println("Dues : "+this.dues+"\n");
    }

    public void addCourse(Course course){
        if(!this.coursesEnrolled.contains(course)){
            this.coursesEnrolled.add(course);
        }
    }

    public void enroll(Course course){
        course.addStudent(this);
        this.addCourse(course);
        this.dues+=course.getFees();
        this.duesCleared=false;
        System.out.println(this.name+" has been enrolled into "+course.getName());
        System.out.println(this.name+" dues = "+this.dues);
        System.out.println("Kindly clear dues well in time.\n");
    }

    public void displayDues(){
        System.out.println("Dues of "+this.name+" are "+this.dues+"\n");
    }

    public void clearDues(){
        this.dues=0;
        this.duesCleared=true;
        System.out.println("Dues of "+this.name+" have been cleared to "+this.dues+"\n");
    }

    public void displayCourses(){
        if(this.coursesEnrolled.isEmpty()){
            System.out.println(this.name+" is not enrolled in any courses at the moment.\n");
        }
        else{
            System.out.println("Courses Enrolled :");
            for(Course c: coursesEnrolled){
                System.out.println(c.getName());
            }
        }
        System.out.println("\n");
    }
}
