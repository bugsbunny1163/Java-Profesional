package task3;

import java.time.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        LocalDateTime fromDateTime = LocalDateTime.of(1992, Calendar.MARCH, 22, 11, 1, 1);
        LocalDateTime toDateTime = LocalDateTime.now();
        getTimeBetweenTwoDates(fromDateTime, toDateTime);
    }

    private static void getTimeBetweenTwoDates(LocalDateTime fromDateTime, LocalDateTime toDateTime) {
        Period period = Period.between(LocalDate.from(fromDateTime), LocalDate.from(toDateTime));
        Duration duration = Duration.between(fromDateTime, toDateTime);
        int hours;
        int minutes;
        int seconds;
        if (LocalTime.from(fromDateTime).compareTo(LocalTime.from(toDateTime)) > 0) {
            period = period.minusDays(1);
        }
        hours = duration.toHoursPart();
        minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();


        System.out.printf("Вам исполнилось %d лет, %d месяца, %d дней, %d часа, %d минут и %d секунд\n", years, months, days, hours, minutes, seconds);
    }
}