package case_study.models;

public class Room extends Facility{
    private String dichVuKem;

    public Room () {
    }

    public String getDichVuKem() {
        return dichVuKem;
    }

    public void setDichVuKem(String dichVuKem) {
        this.dichVuKem = dichVuKem;
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuKem = dichVuKem;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "dichVuKem='" + dichVuKem + '\'' +
                '}';
    }

    public String getInfoRoomToCSV() {
        return tenDichVu+","+dienTichSuDung+","+chiPhiThue+","+soLuongNguoi+","+kieuThue+","+dichVuKem;
    }
}
