module atv.exerciciostomorrow {
    requires javafx.controls;
    requires javafx.fxml;


    opens atv.exerciciostomorrow to javafx.fxml;
    exports atv.exerciciostomorrow;
}