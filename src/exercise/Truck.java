package exercise;

public class Truck extends Vehicles{
    protected int trongTai;

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
}
