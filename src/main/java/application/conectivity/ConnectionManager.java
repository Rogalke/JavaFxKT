package application.conectivity;

import java.sql.*;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb?useLegacyDatetimeCode=false&serverTimezone=Europe/Warsaw";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    private static Connection dbConnect(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private static void closeConnection(Connection connection) {

        try {
            if (connection != null && connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet dbExecuteQuery(String query){

        Connection connection = dbConnect();
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }

        return resultSet;
    }


}
