package exercise;

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

//    public Car addCar() {
//        System.out.print("Nhập biển kiểm soát: ");
//        bienKiemSoat = sca.nextLine();
//        System.out.print("Nhập hãng sản xuất: ");
//        hangSanXuat = sca.nextLine();
//        System.out.print("Nhập năm sản xuất: ");
//        namSanXuat = Integer.parseInt(sca.nextLine());
//        System.out.print("Nhập chủ sở hữu: ");
//        chuSoHuu = sca.nextLine();
//        System.out.print("Nhập kiểu xe: ");
//        kieuXe = sca.nextLine();
//        System.out.print("Nhập số chỗ ngồi: ");
//        soChoNgoi = Integer.parseInt(sca.nextLine());
//        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
//        return car;
//    }

}
