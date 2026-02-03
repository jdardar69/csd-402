module com.example.dardarmod6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dardarmod6 to javafx.fxml;
    exports com.example.dardarmod6;
}