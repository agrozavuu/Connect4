module com.aetxabao.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.agrozavuu.connect4 to javafx.fxml;
    exports com.agrozavuu.connect4;
}