package application.controllers;

import application.service.UserService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import application.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private Button loginButton;

    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField loginPasswordField;

    @FXML
    private Label statusLabel;

    private UserService userService;

    public LoginController() {
        userService = new UserService();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void login() {
        String username = loginTextField.getText();
        String password = loginPasswordField.getText();
        if (!username.trim().isEmpty() && !password.trim().isEmpty()) {
            if (userService.isUserValid(username,password) ){
                statusLabel.setText("login correct");

            } else {
                statusLabel.setText("invalid credentials");
            }
        } else {
            statusLabel.setText("one of text field is empty");
        }

    }

}


