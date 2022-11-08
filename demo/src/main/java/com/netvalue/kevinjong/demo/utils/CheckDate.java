package com.netvalue.kevinjong.demo.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class CheckDate {

    private static List<DateTimeFormatter> formatters = new LinkedList<>();

    static {
        formatters.add(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        formatters.add(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        formatters.add(DateTimeFormatter.BASIC_ISO_DATE);
        formatters.add(DateTimeFormatter.ISO_DATE);
        formatters.add(DateTimeFormatter.ISO_DATE_TIME);
        formatters.add(DateTimeFormatter.ISO_INSTANT);
        formatters.add(DateTimeFormatter.ISO_LOCAL_DATE);
        formatters.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        formatters.add(DateTimeFormatter.ISO_LOCAL_TIME);
        formatters.add(DateTimeFormatter.ISO_OFFSET_DATE);
        formatters.add(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        formatters.add(DateTimeFormatter.ISO_OFFSET_TIME);
        formatters.add(DateTimeFormatter.ISO_ORDINAL_DATE);
        formatters.add(DateTimeFormatter.ISO_TIME);
        formatters.add(DateTimeFormatter.ISO_WEEK_DATE);
        formatters.add(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        formatters.add(DateTimeFormatter.RFC_1123_DATE_TIME);

    }

    private CheckDate() { }

    /**
     *
     * @param dateValue the value represented as date.
     * @return a LocalDateTIme instance if the value is valid, else it will return null.
     */
    public static LocalDateTime becomesDateTime(String dateValue) {
        LocalDateTime date = null;
        for(DateTimeFormatter formatter : formatters) {
            try {
                date = LocalDateTime.parse(dateValue, formatter);
                break;
            } catch (DateTimeParseException e) { System.out.println(e.getMessage()); }
        }
        return date;
    }

    public static LocalDateTime becomesDateTime(String dateValue, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        LocalDateTime date;
        try {date = LocalDateTime.parse(dateValue, formatter);}
        catch (DateTimeParseException e) { date = null; System.out.println((e.getMessage())); }
        return date;
    }

    public static LocalDate becomesDate(String dateValue) {
        LocalDate date = null;
        for(DateTimeFormatter formatter : formatters) {
            try {
                date = LocalDate.parse(dateValue, formatter);
                break;
            } catch (DateTimeParseException e) { System.out.println(e.getMessage()); }
        }
        return date;
    }

    public static LocalDate becomesDate(String dateValue, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, Locale.ENGLISH);
        LocalDate date;
        try {date = LocalDate.parse(dateValue, formatter);}
        catch (DateTimeParseException e) { date = null; System.out.println((e.getMessage())); }
        return date;
    }

    public static List<DateTimeFormatter> getFormatters() {
        return formatters;
    }
}
