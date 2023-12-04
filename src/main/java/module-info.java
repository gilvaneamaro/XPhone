module com.xphone.xphone {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.xphone.xphone to javafx.fxml;
    exports com.xphone.xphone;
}