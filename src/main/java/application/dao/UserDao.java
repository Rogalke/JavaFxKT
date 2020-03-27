package application.dao;

import application.conectivity.ConnectionManager;
import application.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private static final String SELECT = "select";
    private static final String FROM_USER = "from user";
    private static final String ID_USER = "idUser";
    private static final String USERNAME = "Username";
    private static final String PASSWORD = "Password";
    private static final String FIRSTNAME = "FirstName";
    private static final String LASTNAME = "LastName";
    private static final String WHERE = " where";

    public User selectUserByUsername(String username) throws SQLException {
        User user = new User();
        String query = SELECT + " * " + FROM_USER + WHERE + " "+USERNAME+"="+"'"+username+"'";
        System.out.println(query);
        ResultSet resultSet = ConnectionManager.dbExecuteQuery(query);
        while(resultSet.next()){
            user.setUserId(resultSet.getInt(ID_USER));
            user.setUsername(resultSet.getString(USERNAME));
            user.setPassword(resultSet.getString(PASSWORD));
            user.setFirstName(resultSet.getString(FIRSTNAME));
            user.setLastName(resultSet.getString(LASTNAME));
        }
        System.out.println(user);
        return user;
    }
}
