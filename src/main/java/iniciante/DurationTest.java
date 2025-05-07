package iniciante;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String [] args){
        LocalDate d04 = LocalDate.parse("2025-05-07");
        LocalDateTime d05 = LocalDateTime.parse("2025-05-07T18:10:00");
        Instant d06 = Instant.parse("2025-05-07T18:11:00Z");

        //LocalDate
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusYears(7);

        System.out.println("-------------DateTime-----------");
        System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
        System.out.println("d04 = "+d04);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);

        //LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusYears(7);

        System.out.println("-----------LocalDateTime--------------");
        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        System.out.println("d05 = "+d05);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDateTime);

        //Instant
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS );
        Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println("-------------Instant---------------");
        System.out.println("pastWeekInstant = "+pastWeekInstant);
        System.out.println("d06 = "+d05);
        System.out.println("nextWeekInstant = "+nextWeekInstant);

        //Calcular duração
        System.out.println("-----------Duration---------------");
        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0),d04.atTime(0,0)); //adicionando o tempo em um local date (convertendo para LocalDateTime)
        Duration t1Test = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay()); //adicionando o tempo a apartir da meia noite
        System.out.println("t1 dias = "+ t1.toSeconds());

        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        System.out.println("t2 dias = "+ t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant,d06);
        System.out.println("t3 dias = "+ t3.toDays());
        Duration t4 = Duration.between(d06,pastWeekInstant);
        System.out.println("t4 dias = "+ t4.toDays());
    }
}
