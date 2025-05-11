package iniciante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DataHoraAprendizado {
    public static void main(String[]args) throws ParseException {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Local Date Locais
        LocalDate d01 = LocalDate.now(); //dia mes e ano locais
        System.out.println("d01 = "+d01);
        LocalDateTime d02 = LocalDateTime.now(); //dia mes ano e horas locais
        System.out.println("d02 = "+d02);

        //Data Global
        Instant d03 = Instant.now();
        System.out.println("d03 = "+d03);

        //Formatação e criação
        LocalDate d04 = LocalDate.parse("2025-05-06");
        System.out.println("d04 = "+d04);
        LocalDateTime d05 = LocalDateTime.parse("2025-05-06T01:30:26");
        System.out.println("d05 = "+d05);
        Instant d06 = Instant.parse("2025-05-06T01:30:26Z");
        System.out.println("d06 = "+d06);
        Instant d07 = Instant.parse("2025-05-06T01:30:26-03:00");
        System.out.println("d07 = "+d07);
        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        System.out.println("d08 = "+d08);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println("d09 = "+d09);
        LocalDate d10 = LocalDate.of(2022,7,20);
        System.out.println("d10 = "+d10);
        LocalDateTime d11 = LocalDateTime.of(2025,05,06,15,04);
        System.out.println("d11 = "+d11);

        //Formatação verdadeira
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));
        System.out.println("d04-fmt = " +d04.format(fmt3));
        System.out.println("d04-fmt = " +fmt3.format(d04));
        System.out.println("d04-fmt = " +d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d02-fmt = " +d02.format(fmt4));
        //imprimindo de forma formatada uma data hora global formatada
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d02-fmt = " +fmt5.format(d06));
        System.out.println("Formato constantes date time\n"+ d05.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //Outra forma
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = sdf1.parse("09/05/2025");
        Date data2 = sdf2.parse("25/06/2025 14:59:25");
        Date dataAtual = new Date();
        Date dataAtual2 = new Date(System.currentTimeMillis());

        System.out.println("data = "+data);
        System.out.println("data sdf = "+sdf1.format(data));
        Calendar calendar;
    }
}
