package he_thong_quan_li_sinh_vien_cs.models;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private String maGiaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLopHoc, String tenLopHoc, String maGiaoVien) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "maLopHoc='" + maLopHoc + '\'' +
                ", tenLopHoc='" + tenLopHoc + '\'' +
                ", maGiaoVien='" + maGiaoVien + '\'' +
                '}';
    }

    public String getInfoLopHocToCSV() {
        return maLopHoc+","+tenLopHoc+","+maGiaoVien;
    }
}
