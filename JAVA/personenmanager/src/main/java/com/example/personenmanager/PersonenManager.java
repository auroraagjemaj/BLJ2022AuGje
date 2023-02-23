package com.example.personenmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PersonenManager {

    @FXML
    private TextField textField_Name;
    @FXML
    private TextField textField_Lastname;

    @FXML
    private TextField textField_Age;
    @FXML
    private TextField textField_City;
    @FXML
    private TextField textField_Height;

    private Methodsdasdgsdg mgr = new Methodsdasdgsdg();

    @FXML
    private void newPerson(){
        mgr.createPerson(textField_Name.getText(), textField_Lastname.getText(),
                Integer.parseInt(textField_Age.getText()), textField_City.getText(),
                Integer.parseInt(textField_Height.getText()));
    }


}
