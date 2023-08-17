package proxy;

public class DBConnectionImpl implements DBConnection {
    private String dataBaseName;

    public DBConnectionImpl(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    @Override
    public String connect() {
        return "Подключено: " + dataBaseName;
    }
}
