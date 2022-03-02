package exercise;

public class Truck extends Vehicles{
    private int trongTai;

    public Truck() {
    }

    public Truck(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trongTai=" + trongTai+", " +super.toString()+
                '}';
    }

    public Truck addTruck() {
        System.out.print("Nhập biển kiểm soát: ");
        bienKiemSoat = sca.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        chuSoHuu = sca.nextLine();
        System.out.print("Nhập tải trọng: ");
        trongTai = Integer.parseInt(sca.nextLine());
        Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        return truck;
    }
}
