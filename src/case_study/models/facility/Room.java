package case_study.models.facility;

import case_study.models.facility.Facility;

public class Room extends Facility {
    private String dichVuKem;

    public Room () {
    }

    public String getDichVuKem() {
        return dichVuKem;
    }

    public void setDichVuKem(String dichVuKem) {
        this.dichVuKem = dichVuKem;
    }

    public Room(String maDichVu, String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuKem) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuKem = dichVuKem;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "dichVuKem='" + dichVuKem + '\'' +
                '}';
    }

    public String getInfoRoomToCSV() {
        return super.getInfoToCSV()+","+dichVuKem;
    }
}
