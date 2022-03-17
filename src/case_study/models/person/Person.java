package case_study.models.person;

public abstract class Person {
    protected int maSo;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected long soCMDN;
    protected String email;
    protected long soDienThoai;

    public Person () {
    }

     public Person(int maSo, String hoTen, String ngaySinh, String gioiTinh, long soCMDN, String email, long soDienThoai) {
         this.maSo = maSo;
         this.hoTen = hoTen;
         this.ngaySinh = ngaySinh;
         this.gioiTinh = gioiTinh;
         this.soCMDN = soCMDN;
         this.email = email;
         this.soDienThoai = soDienThoai;
     }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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
                "maSo=" + maSo +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMDN=" + soCMDN +
                ", email='" + email + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }
}

