package Lesson29;

import Lesson10.p4.D;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Работаем с: " + ldt1.format(f1));
            ldt1 = ldt1.plus(p);
            System.out.println("До: " + ldt1.format(f1));
            System.out.println("Отдыхаем с: " + ldt1.format(f2));
            ldt1 = ldt1.plus(d);
            System.out.println("До: " + ldt1.format(f2));
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        m.smena(ldt1, ldt2, p, d);
    }
}



