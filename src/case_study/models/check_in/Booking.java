package case_study.models.check_in;

import case_study.utils.BookingComparator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private int maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int maKhachHang;
    private String maDichVu;
    private String loaiDichVu;

    public Booking () {
    }

    public Booking(int maBooking, String ngayBatDau, String ngayKetThuc, int maKhachHang, String maDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", maKhachHang=" + maKhachHang +
                ", maDichVu='" + maDichVu + '\'' +
                ", loaiDichVu='" + loaiDichVu + '\'' +
                '}';
    }

    public String getInfoBookingToCSV() {
        return maBooking+","+ngayBatDau+","+ngayKetThuc+","+maKhachHang+","+maDichVu+","+loaiDichVu;
    }

    @Override
    public int compareTo(Booking o) {
        return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Booking booking = (Booking) o;
//        return maKhachHang == booking.maKhachHang;
//    }
//
//    @Override
//    public int hashCode() {
//        return 12;
//    }
}
