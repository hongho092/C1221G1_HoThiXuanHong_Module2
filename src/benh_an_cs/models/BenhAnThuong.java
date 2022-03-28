package benh_an_cs.models;

public class BenhAnThuong extends BenhAn{
    private String phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDoNhapVien, String phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, liDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + super.toString()+
                "phiNamVien='" + phiNamVien + '\'' +
                '}';
    }

    public String getInfoThuongToCSV() {
        return super.getInfoToCSV()+phiNamVien;
    }

    @Override
    public int compareTo(BenhAn o) {
        return this.getSoThuTu() - o.getSoThuTu();
    }
}
