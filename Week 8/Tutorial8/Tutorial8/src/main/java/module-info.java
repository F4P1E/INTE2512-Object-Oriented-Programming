module com.example.tutorial8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tutorial8 to javafx.fxml;
    exports com.example.tutorial8;
}