package case_study.models.facility;

import java.time.*;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class Facility {
    protected String maDichVu;
    protected String tenDichVu;
    protected int dienTichSuDung;
    protected int chiPhiThue;
    protected int soLuongNguoi;
    protected String kieuThue;

    public Facility() {
    }

    public Facility(String maDichVu, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(int dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return  "maDichVu='" + maDichVu + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue=" + kieuThue +", ";
    }

    public String getInfoToCSV() {
        return maDichVu+","+tenDichVu+","+dienTichSuDung+","+chiPhiThue+","+soLuongNguoi+","+kieuThue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return maDichVu.equals(facility.maDichVu);
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
