package intermediarioOO.exercicioDeFixacao.entities;

import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date bithDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Client(){
    }

    public Client(String name, String email, Date bithDate) {
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    @Override
    public String toString(){
        return this.name + "(" + sdf.format(this.bithDate + ")" + this.email);
    }
}
