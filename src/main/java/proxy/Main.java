package proxy;

public class Main {

    public static void main(String[] args) {
        DBConnectionImpl dbConnection = new DBConnectionImpl("myDataBase");
        DBConnectionProxy proxy = new DBConnectionProxy(dbConnection);
        System.out.println(proxy.connect());
    }
}
