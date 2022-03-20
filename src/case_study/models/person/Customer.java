package case_study.models.person;

import case_study.models.person.Person;

public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;
    private int maKhachHang;

    public Customer () {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, long soCMDN, String email, String soDienThoai, String loaiKhach, String diaChi, int maKhachHang) {
        super(hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", maKhachHang=" + maKhachHang +
                '}';
    }

    public String getInfoCustomerToCSV() {
        return super.getInfoToCSV()+","+loaiKhach+","+diaChi+","+maKhachHang;
    }
}
//Loại khách, Địa chỉ