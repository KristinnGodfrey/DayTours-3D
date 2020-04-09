package Controller;

import Model.Tour;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class TourController {

    @FXML
    private Button bookButton;
    @FXML
    private Button backButton;
    @FXML
    private Text date;
    @FXML
    private Text name;
    @FXML
    private Text price;
    @FXML
    private Text seats;
    @FXML
    private Text rating;
    @FXML
    private Text length;
    @FXML
    private Text guide;
    @FXML
    private Text info;
    @FXML
    public void initialize() {

    }

    @FXML
    void bookButtonHandler(ActionEvent event) {
        System.out.println("Túr bókaður");
    }

    public void initData(Tour tour){
        name.setText(tour.getName());
        guide.setText(tour.getTourGuide());
        info.setText(tour.getDescription());
        date.setText(tour.getDate());
        length.setText(tour.getDuration() + " hours");
        seats.setText(tour.getSeatsLeft() + "available seats out of" + tour.getSeats());
        price.setText(Integer.toString(tour.getPrice()));
    }

    @FXML
    void backButtonHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("./View/searchTours.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
