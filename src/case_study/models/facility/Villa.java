package case_study.models.facility;

import case_study.models.facility.Facility;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private int dienTichHoBoi;
    private int soTang;

    public Villa () {
    }

    public Villa(String maDichVu, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, int dienTichHoBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }

    public String getInfoVillaToCSV() {
        return super.getInfoToCSV()+","+tieuChuanPhong+","+dienTichHoBoi+","+soTang;
    }
}
