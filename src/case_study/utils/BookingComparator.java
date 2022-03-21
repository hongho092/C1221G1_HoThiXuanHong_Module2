package case_study.utils;

import case_study.models.check_in.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDay1 = LocalDate.parse(o1.getNgayBatDau(), formatter);
        LocalDate startDay2 = LocalDate.parse(o2.getNgayBatDau(), formatter);
        LocalDate endDay1 = LocalDate.parse(o1.getNgayKetThuc(), formatter);
        LocalDate endDay2 = LocalDate.parse(o2.getNgayKetThuc(), formatter);

        if (startDay2.compareTo(startDay1) < 0) {
            return 1;
        } else if (startDay2.compareTo(startDay1) > 0) {
            return -1;
        } else {
            if (endDay1.compareTo(endDay2) < 0) {
                return 1;
            } else if (endDay1.compareTo(endDay2) > 0) {
                return -1;
            } else
                return 0;
        }
    }
}
