package case_study.models;

public class Contract {
    protected int soHopDong;
    protected int maBooking;
    protected int soTienDatCoc;
    protected int tongThanhToan;
    protected int maKhachHang;

    public Contract () {
    }

    public Contract(int soHopDong, int maBooking, int soTienDatCoc, int tongThanhToan, int maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienDatCoc = soTienDatCoc;
        this.tongThanhToan = tongThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienDatCoc() {
        return soTienDatCoc;
    }

    public void setSoTienDatCoc(int soTienDatCoc) {
        this.soTienDatCoc = soTienDatCoc;
    }

    public int getTongThanhToan() {
        return tongThanhToan;
    }

    public void setTongThanhToan(int tongThanhToan) {
        this.tongThanhToan = tongThanhToan;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", maBooking=" + maBooking +
                ", soTienDatCoc=" + soTienDatCoc +
                ", tongThanhToan=" + tongThanhToan +
                ", maKhachHang=" + maKhachHang +
                '}';
    }

    public String getInfoContractToCSV() {
        return soHopDong+","+maBooking+","+soTienDatCoc+","+tongThanhToan+","+maKhachHang;
    }
}
