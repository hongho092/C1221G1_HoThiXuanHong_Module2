package phone_cs.models;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(int id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" +super.toString()+
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }

    public String getInfoXTToCSV() {
        return super.getInfoToCSV()+","+quocGiaXachTay+","+trangThai;
    }

    @Override
    public int compareTo(DienThoai o) {
        return this.getId() - o.getId();
    }
}
