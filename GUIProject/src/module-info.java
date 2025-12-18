module Lost {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens hust.soict.program.javafx to javafx.fxml;
    exports hust.soict.program.javafx;
}