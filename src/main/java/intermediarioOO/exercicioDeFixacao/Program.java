package intermediarioOO.exercicioDeFixacao;

import intermediarioOO.exercicioDeFixacao.entities.Client;
import intermediarioOO.exercicioDeFixacao.entities.OrderItem;
import intermediarioOO.exercicioDeFixacao.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) throws ParseException {
        //https://www.youtube.com/watch?v=gj80JEqk5ms
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product("TV", 1000.0);
        OrderItem oi1 = new OrderItem(1, 1000.0,p);
        System.out.println(oi1);
        Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
        System.out.println(cli);
        sc.close();
    }
}
