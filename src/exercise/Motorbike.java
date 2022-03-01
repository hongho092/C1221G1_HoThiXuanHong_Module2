package exercise;

public class Motorbike extends Vehicles{
    private int congSuat;

    public Motorbike() {
    }

    public Motorbike(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "congSuat=" + congSuat + super.toString()+
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
        System.out.println("Nhập công suất: ");
        congSuat = Integer.parseInt(sca.nextLine());
        Motorbike motorbike = new Motorbike(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        return Motorbike;
    }


}
