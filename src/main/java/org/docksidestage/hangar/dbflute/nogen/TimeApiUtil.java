package org.docksidestage.hangar.dbflute.nogen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author jflute
 */
public class TimeApiUtil {

    public static LocalDate toLocalDate(Date utilDate) {
        if (utilDate == null) {
            return null;
        }
        ZonedDateTime zonedDateTime = toZonedDateTime(utilDate);
        return zonedDateTime.toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Date utilDate) {
        if (utilDate == null) {
            return null;
        }
        ZonedDateTime zonedDateTime = toZonedDateTime(utilDate);
        return zonedDateTime.toLocalDateTime();
    }

    public static ZonedDateTime toZonedDateTime(Date utilDate) {
        if (utilDate == null) {
            return null;
        }
        final ZoneId systemDefault = ZoneId.systemDefault();
        return ZonedDateTime.ofInstant(utilDate.toInstant(), systemDefault);
    }

    public static Date toUtilDate(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return toUtilDate(localDate.atTime(0, 0, 0, 0));
    }

    public static Date toUtilDate(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        final ZoneId systemDefault = ZoneId.systemDefault();
        return Date.from(localDateTime.toInstant(systemDefault.getRules().getOffset(localDateTime)));
    }
}
