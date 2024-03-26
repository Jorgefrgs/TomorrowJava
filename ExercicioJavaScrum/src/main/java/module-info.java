module com.example.exerciciojavascrum {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciojavascrum to javafx.fxml;
    exports com.example.exerciciojavascrum;
}