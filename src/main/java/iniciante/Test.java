package iniciante;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Test {
    public static void test(Object... a){
        for(Object ab: a){
            System.out.println(ab);
        }
    }
    public static void main(String [] args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Alo");
        lista.add("Ola");
        lista.add("Oi");
        test(lista, new ArrayList<>());
        lista.removeIf(x -> x.startsWith("A"));
    }
}
