package university;
public class Student{
    String name;
    String dob;
    Contact contact;

    public Student(){
        this.name=null;
        this.dob=null;
        this.contact=null;
    }

    public Student(String name, String dob, int cell, String username){
        this.name=name;
        this.dob=dob;
        this.contact=new Contact(cell,username);
    }

    void displayInfo(){
        System.out.println("Name : "+name+"\nDate of Birth : "+dob+"\nCell no. : "+contact.getCell()+"\nEmail Address : "+contact.getEmail()+"\n");
    }
}
