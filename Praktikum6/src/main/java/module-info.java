module org.example.praktikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.praktikum6 to javafx.fxml;
    exports org.example.praktikum6;
}