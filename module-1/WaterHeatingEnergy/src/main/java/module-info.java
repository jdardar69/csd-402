module com.example.waterheatingenergy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.waterheatingenergy to javafx.fxml;
    exports com.example.waterheatingenergy;
}