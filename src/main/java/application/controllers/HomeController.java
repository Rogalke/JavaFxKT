package application.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class HomeController {

    @FXML
    private AnchorPane anchorpaneUser;

    @FXML
    private TableView<?> tableviewUser;

    @FXML
    private TableColumn<?, ?> tablecolumnId;

    @FXML
    private TableColumn<?, ?> tablecolumnFirstname;

    @FXML
    private TableColumn<?, ?> tablecolumnLastname;

    @FXML
    private VBox vboxButtons;

    @FXML
    private Button buttonSearch;

    @FXML
    private Button buttonEdit;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonLogout;

    @FXML
    private VBox vboxSearch;

    @FXML
    private Label labellId;

    @FXML
    private TextField tesxtfieldId;

    @FXML
    private Label labelFirstname;

    @FXML
    private TextField textfieldFirstname;

    @FXML
    private Label labelLastname;

    @FXML
    private TextField textfieldLastname;

}
