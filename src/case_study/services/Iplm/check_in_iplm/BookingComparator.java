package case_study.services.Iplm.check_in_iplm;

import case_study.models.check_in.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getNgayBatDau().compareTo(o2.getNgayBatDau());
    }
}
