module com.example.mod_3_csd402 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mod_3_csd402 to javafx.fxml;
    exports com.example.mod_3_csd402;
}