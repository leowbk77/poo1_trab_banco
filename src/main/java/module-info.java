module trab.poo1_trab_banco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens trab.poo1_trab_banco to javafx.fxml;
    exports trab.poo1_trab_banco;
    exports trab.poo1_trab_banco.models;
    opens trab.poo1_trab_banco.models to javafx.fxml;
}