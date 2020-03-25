package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.model.User;

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

    public LoginController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void login() {
        if (!loginTextField.getText().trim().isEmpty() && !loginPasswordField.getText().trim().isEmpty()) {
            boolean isLogin = loginTextField.getText().equalsIgnoreCase(User.getExampleUser().getLogin());
            boolean isPassword = loginPasswordField.getText().equalsIgnoreCase(User.getExampleUser().getPassword());

            if ( isLogin && isPassword ){
                statusLabel.setText("login correct");

            } else {
                statusLabel.setText("invalid credentials");
            }
        } else {
            statusLabel.setText("one of text field is empty");
        }

    }

}


