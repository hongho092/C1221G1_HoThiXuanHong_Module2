package ss20_solid.open_close.demo1_not;

public class Main {
    public static void main(String[] args) {
        MySQL mySQL = new MySQL();
        Oracle oracle = new Oracle();
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.doConnection(oracle);
    }

}
