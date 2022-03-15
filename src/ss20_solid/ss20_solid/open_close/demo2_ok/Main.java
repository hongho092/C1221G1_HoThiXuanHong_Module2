package ss20_solid.open_close.demo2_ok;

public class Main {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        MySQL mySQL = new MySQL();
        IBM ibm = new IBM();
        connectionManager.doConnection(ibm);
        KetNoiCSDLKhac ketNoiCSDLKhac = new KetNoiCSDLKhac();
        connectionManager.doConnection(ketNoiCSDLKhac);
    }
}
