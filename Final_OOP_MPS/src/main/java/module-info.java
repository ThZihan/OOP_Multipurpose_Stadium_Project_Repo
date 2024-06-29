module com.group47.main_pkg.final_oop_mps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group47.main_pkg.final_oop_mps to javafx.fxml;
    exports com.group47.main_pkg.final_oop_mps;
}