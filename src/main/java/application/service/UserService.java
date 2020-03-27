package application.service;

import application.dao.UserDao;
import application.model.User;

import java.sql.SQLException;

public class UserService{
    private UserDao userDao;

    public UserService(){
        this.userDao = new UserDao();
    }

    public boolean isUserValid(String username, String password){
        User user = new User();
        boolean isUsername = false;
        boolean isPassword = false;
        try {
            user = userDao.selectUserByUsername(username);
            System.out.println(user);
            isUsername = username.equalsIgnoreCase(user.getUsername());
            System.out.println(isUsername);
            isPassword = password.equalsIgnoreCase(user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (isUsername && isPassword);
    }
}
