package exercise.models;

public class Car extends Vehicles {
    protected int soChoNgoi;
    protected String kieuXe;

    public Car () {
    }

    public Car(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe +", " +super.toString()+
                '}';
    }

    public String getInfoCarToCSV() {
        return this.bienKiemSoat+","+this.hangSanXuat+","+this.namSanXuat+","+this.chuSoHuu+","+this.soChoNgoi+","+this.kieuXe;
    }

}
