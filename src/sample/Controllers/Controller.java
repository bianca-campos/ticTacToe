package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import sample.Models.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Label player;

    private ArrayList<Button> buttons;
    private boolean turn;
    private Person player1;
    private Person player2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initialize your components or instance variables
        turn = true;
        player1 = new Person("Other");
        player2 = new Person("Bianca");
        changeLabel();

        buttons = new ArrayList<>();
        buttons.add(btn0);
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);
        buttons.add(btn7);
        buttons.add(btn8);
        for (int i = 0; i < buttons.size(); i++){
            buttons.get(i).getStyleClass().add("tic-button");
        }

    }

    public void buttonClicked(ActionEvent actionEvent) {
        //which button is clicked
        Button btn = (Button) actionEvent.getSource();
        if (btn.getText().equals("")){
            if (turn){
                btn.setText("O");
            } else {
                btn.setText("X");
            }
            turn = !turn;
            changeLabel();
        }

//        String id = btn.getId();
//        int index =  Integer.parseInt(id.substring(3,4));

//        buttons.get(index);
//        System.out.println(btn.getId());
    }

    private void changeLabel() {

        if (turn){
            player.setText(player1.getName());
        }else {
            player.setText(player2.getName());
        }
    }
}
