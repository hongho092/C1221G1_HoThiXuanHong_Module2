package exercise;

public class Car extends Vehicles {
    private int soChoNgoi;
    private String kieuXe;

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
                ", kieuXe='" + kieuXe + '\'' +super.toString()+
                '}';
    }

    @Override
    public Car addVehicle() {
        System.out.println("Nhập biển kiểm soát: ");
        bienKiemSoat = sca.nextLine();
        System.out.println("Chọn và nhập hãng sản xuất: ");
        showHangSanXuat();
        hangSanXuat = sca.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.println("Nhập chủ sở hữu: ");
        chuSoHuu = sca.nextLine();
        System.out.println("Nhập kiểu xe: ");
        kieuXe = sca.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        soChoNgoi = Integer.parseInt(sca.nextLine());
        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        return car;
    }

}
