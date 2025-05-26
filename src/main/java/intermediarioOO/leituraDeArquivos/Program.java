package intermediarioOO.leituraDeArquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String [] fields = line.split(",");
                employeeList.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salary = Double.parseDouble(sc.nextLine());

            System.out.println("Email of peaple whose salary is more then "+String.format("%.2f",salary)+":");
            employeeList.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted((s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

            Double soma = employeeList.stream()
                    .filter(e -> e.getName().toUpperCase().startsWith("M"))
                    .map(e -> e.getSalary())
                    .reduce(0.0,(x,y) -> x + y);
            System.out.println("Sum of salary of peaple whose name starts with 'M':"+soma);
            sc.close();

        } catch (IOException e){
            e.printStackTrace();
        }




    }
}
