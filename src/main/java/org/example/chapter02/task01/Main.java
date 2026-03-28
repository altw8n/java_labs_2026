package org.example.chapter02.task01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = getStartDate(args);
        int month = date.getMonthValue();
        printCalendar(date, month);
    }

    private static LocalDate getStartDate(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        if (args.length >= 2) {
            int month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        }
        return date;
    }

    private static void printCalendar(LocalDate date, int month) {
        printWeekdaysHeader();
        int indent = calculateIndent(date.getDayOfWeek());
        printIndent(indent);
        LocalDate currentDate = date;
        while (currentDate.getMonthValue() == month) {
            System.out.printf("%4d", currentDate.getDayOfMonth());
            if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
            currentDate = currentDate.plusDays(1);
        }
        if (date.plusMonths(1).minusDays(1).getDayOfWeek() != DayOfWeek.SUNDAY) {
            System.out.println();
        }
    }

    private static void printWeekdaysHeader() {
        for (DayOfWeek day : DayOfWeek.values()) {
            String shortName = day.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            System.out.printf("%4s", shortName);
        }
        System.out.println();
    }

    private static int calculateIndent(DayOfWeek firstDayOfMonth) {
        return firstDayOfMonth.getValue() - 1;
    }

    private static void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");
        }
    }
}