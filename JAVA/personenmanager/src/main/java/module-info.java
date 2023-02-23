module com.example.personenmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.personenmanager to javafx.fxml;
    exports com.example.personenmanager;
}