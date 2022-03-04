package exercise;

public class Motorbike extends Vehicles{
    protected  int congSuat;

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

}
