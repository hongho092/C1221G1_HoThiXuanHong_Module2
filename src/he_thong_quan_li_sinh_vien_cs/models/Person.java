package he_thong_quan_li_sinh_vien_cs.models;

public abstract class Person {
    protected int id;
    protected String ten;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String soDienThoai;

    public Person() {
    }

    public Person(int id, String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai +", ";
    }

    public String getInfoToCSV() {
        return id+","+ten+","+ngaySinh+","+gioiTinh+","+soDienThoai+",";
    }
}
