module donjon.donjon {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens donjon.donjon to javafx.fxml;
    exports donjon.donjon;
}