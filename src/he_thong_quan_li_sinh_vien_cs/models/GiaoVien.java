package he_thong_quan_li_sinh_vien_cs.models;

public class GiaoVien extends Person{
    public GiaoVien() {
    }

    public GiaoVien(int id, String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(id, ten, ngaySinh, gioiTinh, soDienThoai);
    }

    @Override
    public String toString() {
        return "GiaoVien{"+super.toString()+"}";
    }
}
