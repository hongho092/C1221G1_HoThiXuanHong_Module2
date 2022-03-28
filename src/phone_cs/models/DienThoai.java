package phone_cs.models;

public abstract class DienThoai implements Comparable<DienThoai>{
    protected int id;
    protected String tenDienThoai;
    protected String giaBan;
    protected String soLuong;
    protected String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(int id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + ", ";
    }

    public String getInfoToCSV() {
        return id+","+tenDienThoai+","+giaBan+","+soLuong+","+nhaSanXuat;
    }

}
