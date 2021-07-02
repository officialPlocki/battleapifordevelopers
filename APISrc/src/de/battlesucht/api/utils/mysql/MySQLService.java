package de.battlesucht.api.utils.mysql;

import java.sql.*;

public class MySQLService {
    public static void connect(String host, String user, String database, String password, String port){
    }

    public static void setMaxConnections() {
    }

    public static void disconnect(){
    }

    public static boolean isConnected(){
        return true;
    }

    public MySQLService() {}

    public Connection getConnection() {
        return null;
    }

    public ResultSet getResult(PreparedStatement sql) {
        return null;
    }

    public void executeUpdate(PreparedStatement sql) {
    }

}
