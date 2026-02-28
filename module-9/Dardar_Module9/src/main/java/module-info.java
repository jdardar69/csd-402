module com.example.dardar_module9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dardar_module9 to javafx.fxml;
    exports com.example.dardar_module9;
}