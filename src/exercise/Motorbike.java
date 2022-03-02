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
                "congSuat=" + congSuat +", "+ super.toString()+
                '}';
    }

    public Motorbike addMotorbike() {
        System.out.print("Nhập biển kiểm soát: ");
        bienKiemSoat = sca.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        chuSoHuu = sca.nextLine();
        System.out.print("Nhập công suất: ");
        congSuat = Integer.parseInt(sca.nextLine());
        Motorbike motorbike = new Motorbike(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        return motorbike;
    }


}
