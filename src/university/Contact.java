package university;
public class Contact{

    private int cell;
    private String email;

    //cell setters and getters

    public void setCell(int cell)throws IllegalArgumentException{
        if (cell<1111111 || cell>10000000){
            throw new IllegalArgumentException("Cell must be a 7-digit number");
        }
        this.cell=cell;
    }

    public int getCell(){
        return this.cell;
    }

    //email setters and getters

    public void setEmail(String username){
        this.email=username+"@gmail.com";
    }

    public String getEmail(){
        return this.email;
    }

    //constructors
    public Contact(){
        this.cell=0;
        this.email=null;
    }

    public Contact(int cell,String username){
        setCell(cell);
        setEmail(username);
    }
}
