module com.uni.unispiel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.uni.unispiel to javafx.fxml;
    exports com.uni.unispiel;
}