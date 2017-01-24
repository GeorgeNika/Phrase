package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user on 20.01.17.
 */
@Service
public class DataService {
    @Autowired private Environment environment;

    public String getDataInfo() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            return "No class";
        }

        Connection connection = null;
        String connectionString = "jdbc:postgresql://"
                +environment.getProperty("OPENSHIFT_POSTGRESQL_DB_HOST")
                +":"
                +environment.getProperty("OPENSHIFT_POSTGRESQL_DB_PORT")
                +"/"
                +environment.getProperty("OPENSHIFT_APP_NAME");

        try {
            connection = DriverManager.getConnection(
                    connectionString,
                    "admin7bi6hht",
                    "tfDGB_yGMtV5");

        } catch (SQLException e) {
            return "No connection " + connectionString;
        }

        try {
            connection.close();
        } catch (SQLException e) {
            return "Error on close";
        }

        return "All good";
    }
}
