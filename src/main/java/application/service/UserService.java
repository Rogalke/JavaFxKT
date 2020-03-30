package application.service;

import application.dao.UserDao;
import application.model.User;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;

@Slf4j
public class UserService{
    private UserDao userDao;

    public UserService(){
        this.userDao = new UserDao();
    }

    public boolean isUserValid(String username, String password){
        User user = null;
        boolean isUsername = false;
        boolean isPassword = false;
        try {
            user = userDao.selectUserByUsername(username);
            isUsername = username.equalsIgnoreCase(user.getUsername());
            isPassword = password.equalsIgnoreCase(user.getPassword());
            log.info("is Password: " + isPassword + " is Username: " + isUsername);
        } catch (SQLException e) {
            log.error("SQL error from UserService");
        } catch (NullPointerException e){
            log.error("Null pointer from UserService");
        }
        return (isUsername && isPassword);
    }
}
