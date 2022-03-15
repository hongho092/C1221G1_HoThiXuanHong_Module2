package ss20_solid.open_close.demo1_not;

public class ConnectionManager {
    public void doConnection(Object connection){
        if (connection instanceof MySQL){
            ((MySQL)connection).doConnect();
        }else if (connection instanceof Oracle){
            ((Oracle)connection).doConnect();
        }else if (connection instanceof SQLServer){
            ((SQLServer)connection).doConnect();
        }else if (connection instanceof IBM){
            ((IBM)connection).doConnect();
        }
    }
}
