module donjon.donjon {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens donjon to javafx.fxml;
    exports donjon;
}