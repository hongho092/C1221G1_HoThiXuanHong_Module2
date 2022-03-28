package he_thong_quan_li_sinh_vien_cs.models;

public class SinhVien extends Person{
    private String maLopHoc;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLopHoc) {
        super(id, ten, ngaySinh, gioiTinh, soDienThoai);
        this.maLopHoc = maLopHoc;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +super.toString()+
                "maLopHoc='" + maLopHoc + '\'' +
                '}';
    }

    public String getInfoSinhVienToCSV() {
        return super.getInfoToCSV()+maLopHoc;
    }
}
