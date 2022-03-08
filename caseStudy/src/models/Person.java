package models;

public abstract class Person {
   protected String hoTen;
   protected int ngaySinh;
   protected String gioiTinh;
   protected long soCMDN;
   protected String email;
   protected long soDienThoai;

   public Person () {
   }

    public Person(String hoTen, int ngaySinh, String gioiTinh, long soCMDN, String email, long soDienThoai) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMDN = soCMDN;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public long getSoCMDN() {
        return soCMDN;
    }

    public void setSoCMDN(long soCMDN) {
        this.soCMDN = soCMDN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMDN=" + soCMDN +
                ", email='" + email + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }
}
