package intermediarioOO.exercicioDeFixacao.data.recorder;

import intermediarioOO.exercicioDeFixacao.data.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        System.out.println(sourceFolderStr);
        boolean sucess = new File(sourceFolderStr + "/out").mkdirs();
        System.out.println("Folder created: " + sucess);

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1]),Integer.parseInt(fields[2])));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for(Product p : list){
                    bw.write(p.getName() + "," + String.format("%.2f",p.getTotal()) + "\n");
                }
                System.out.println(targetFileStr + "CREATED");
            } catch (IOException e) {
                System.out.println("Erro writing" + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }
}
