package fr.univ_amu.iut;

import java.sql.*;

public final class ConnexionUnique {
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/GestionPedaBD";
    private static final String LOGIN = "monUser";
    private static final String PASSWORD = "monPassword";

    private Connection connection;
    private static volatile ConnexionUnique instance;

    private ConnexionUnique() throws SQLException {
        connection = DriverManager.getConnection(CONNECT_URL, LOGIN, PASSWORD);
    }

    public static ConnexionUnique getInstance() throws SQLException {
        if (ConnexionUnique.instance == null) {
            ConnexionUnique.instance = new ConnexionUnique();
        }
        return ConnexionUnique.instance;
    }

    public Connection getConnection() {
        return connection;
    }

}