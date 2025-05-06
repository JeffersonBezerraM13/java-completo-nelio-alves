package iniciante;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDatasLocalGlobal {
    public static void main(String [] args){
        LocalDate d01 = LocalDate.parse("2022-02-02");
        LocalDateTime d02 = LocalDateTime.parse("2023-03-03T20:02:22");
        Instant d03 = Instant.parse("2024-04-04T01:01:11Z");

        //for(String s:ZoneId.getAvailableZoneIds()) System.out.println(s);
        //Global para Local
        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        System.out.println(r1);
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal"));
        System.out.println(r2);
        LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));
        System.out.println(r3);

        //Local para Global
    }
}
