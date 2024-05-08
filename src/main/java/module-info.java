module com.example.pfajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.pfajavafx to javafx.fxml;
    exports com.example.pfajavafx;
}