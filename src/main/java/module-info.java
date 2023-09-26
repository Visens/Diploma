module ru.netology.netology {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ru.netology.netology to javafx.fxml;
    exports ru.netology.netology;
}