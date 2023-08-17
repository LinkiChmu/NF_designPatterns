package proxy;

public class DBConnectionProxy implements DBConnection {
    private final StringBuilder sb;
    private final DBConnectionImpl dbConnection;

    public DBConnectionProxy(DBConnectionImpl dbConnection) {
        this.dbConnection = dbConnection;
        sb = new StringBuilder("localhost:port/");
    }

    @Override
    public String connect() {
        return "Подключено: " + sb.append(dbConnection.getDataBaseName());
    }
}
