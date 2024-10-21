module com.example.javafxtest_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtest_1 to javafx.fxml;
    exports com.example.javafxtest_1;
}