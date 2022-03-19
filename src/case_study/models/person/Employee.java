package case_study.models.person;

import case_study.models.person.Person;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private int luong;
    private int maNhanVien;

    public Employee () {
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, long soCMDN, String email, long soDienThoai, String trinhDo, String viTri, int luong, int maNhanVien) {
        super(hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                ", maNhanVien=" + maNhanVien +
                '}';
    }

    public String getInfoEmployeeToCSV() {
        return hoTen+","+ngaySinh+","+gioiTinh+","+soCMDN+","+email+","+soDienThoai+","+trinhDo+","+viTri+","+luong+","+maNhanVien;
    }
}
////  Trình độ, Vị trí, lương, Mã nhân viên,