package university;
public class Main{
    public static void main(String[] args){
        // create student objects and course objects and test all their methods
        Student javeria=new Student("Javeria Khan","7 July 1999",9999999,"javeriakhan");
        Student mahnoor=new Student("Mahnoor Ayyaz","7 July 1999",1111111,"mahnoorayyaz");
        Student maheen=new Student("Maheen hafeez","8 April 1999",4444444,"maheenhafeez");

        Course oop=new Course("Object Oriented Programming",60000.0);
        Course dld=new Course("Digital Logic Design",57000.0);
        Course dm=new Course("Discrete Mathematics",70000.0);
        Course aict=new Course("Applications of Communication and Information Technology",50000.0);
        Course ew=new Course("Expository Writing",30000.0);

        javeria.displayInfo();
        javeria.displayCourses();
        mahnoor.displayInfo();
        mahnoor.displayCourses();
        maheen.displayInfo();
        maheen.displayCourses();

        oop.displayInfo();
        dld.displayInfo();
        dm.displayInfo();
        aict.displayInfo();
        ew.displayInfo();

        javeria.enroll(oop);
        javeria.enroll(dld);
        javeria.enroll(dm);
        javeria.enroll(aict);
        javeria.enroll(ew);

        mahnoor.enroll(oop);
        mahnoor.enroll(dld);
        mahnoor.enroll(dm);
        mahnoor.enroll(aict);
        mahnoor.enroll(ew);

        maheen.enroll(oop);
        maheen.enroll(dld);
        maheen.enroll(dm);
        maheen.enroll(aict);
        maheen.enroll(ew);

        javeria.displayInfo();
        javeria.displayCourses();
        mahnoor.displayInfo();
        mahnoor.displayCourses();
        maheen.displayInfo();
        maheen.displayCourses();

        oop.displayInfo();
        dld.displayInfo();
        dm.displayInfo();
        aict.displayInfo();
        ew.displayInfo();

        javeria.displayDues();
        mahnoor.displayDues();
        maheen.displayDues();

        javeria.clearDues();
        mahnoor.clearDues();
        maheen.clearDues();

        javeria.displayDues();
        mahnoor.displayDues();
        maheen.displayDues();
    }
}