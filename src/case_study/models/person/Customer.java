package case_study.models.person;

import case_study.models.person.Person;

public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;

    public Customer () {
    }

    public Customer(int maSo, String hoTen, String ngaySinh, String gioiTinh, long soCMDN, String email, long soDienThoai, String loaiKhach, String diaChi) {
        super(maSo, hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
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

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String getInfoCustomerToCSV() {
        return maSo+","+hoTen+","+ngaySinh+","+gioiTinh+","+soCMDN+","+email+","+soDienThoai+","+loaiKhach+","+diaChi;
    }
}
//Loại khách, Địa chỉ