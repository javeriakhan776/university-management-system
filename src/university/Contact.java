package university;
public class Contact{

    private int cell;
    private String email;

    private void setCell(int cell)throws IllegalArgumentException{
        if (cell<1111111 || cell>10000000){
            throw new IllegalArgumentException("Cell must be a 7-digit number");
        }
        this.cell=cell;
    }

    private void setEmail(String username){
        this.email=username+"@gmail.com";
    }

    public Contact(int cell,String username){
        setCell(cell);
        setEmail(username);
    }

    public int getCell(){
        return this.cell;
    }

    public String getEmail(){
        return this.email;
    }
}
