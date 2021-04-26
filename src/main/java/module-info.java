module it.edu.isspitagora.provagit {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.edu.isspitagora.provagit to javafx.fxml;
    exports it.edu.isspitagora.provagit;
}
