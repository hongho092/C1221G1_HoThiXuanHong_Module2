package ss20_solid.open_close.demo2_ok;

public class SQLServer extends Connection {
    @Override
    public void doConnect() {
        System.out.println(" kết nối SQLSErver");
    }
}
