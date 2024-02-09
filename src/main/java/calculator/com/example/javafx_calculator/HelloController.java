package calculator.com.example.javafx_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    int operator = -1;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button Add;

    @FXML
    private TextField Display;

    @FXML
    private Button Eight;

    @FXML
    private Button Five;

    @FXML
    private Button Four;

    @FXML
    private Button Nine;

    @FXML
    private Button One;

    @FXML
    private Button Seven;

    @FXML
    private Button Six;

    @FXML
    private Button Sub;

    @FXML
    private Button Three;

    @FXML
    private Button Two;

    @FXML
    private Button Zero;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button equal;

    @FXML
    private Button mul;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == One){
            Display.setText(Display.getText() + "1");
        }else if(event.getSource() == Two){
            Display.setText(Display.getText() + "2");
        }else if(event.getSource() == Three){
            Display.setText(Display.getText() + "3");
        }else if(event.getSource() == Four){
            Display.setText(Display.getText() + "4");
        }else if(event.getSource() == Five){
            Display.setText(Display.getText() + "5");
        }else if(event.getSource() == Six){
            Display.setText(Display.getText() + "6");
        }else if(event.getSource() == Seven){
            Display.setText(Display.getText() + "7");
        }else if(event.getSource() == Eight){
            Display.setText(Display.getText() + "8");
        }else if(event.getSource() == Nine){
            Display.setText(Display.getText() + "9");

        }else if(event.getSource() == Zero){
            Display.setText(Display.getText() + "0");
        }else if(event.getSource() == clear){
            Display.setText("");
        }else if(event.getSource() == Add){
            double num1 = Double.parseDouble(Display.getText());
            int operator = 1;    //Addition
            Display.setText("");
        }
        else if(event.getSource() == Sub){
            double num1 = Double.parseDouble(Display.getText());
            operator = 2;    //Subtraction
            Display.setText("");
        }
        else if(event.getSource() == mul){
            double num1 = Double.parseDouble(Display.getText());
            operator = 3;    //Multiplication
            Display.setText("");
        }
        else if(event.getSource() == div){
            double num1 = Double.parseDouble(Display.getText());
            operator = 4;    //Division
            Display.setText("");
        }
        else if(event.getSource() == equal){
            double num2 = Double.parseDouble(Display.getText());
            double num1 = 0;
            if(operator == 1){
                double ans = num1 + num2;
                Display.setText(String.valueOf(ans));
            }
            if(operator == 2){
                double ans = num1 - num2;
                Display.setText(String.valueOf(ans));
            }
            if(operator == 3){
                double ans = num1 * num2;
                Display.setText(String.valueOf(ans));
            }
            if(operator == 4){
                double ans = num1 / num2;
                Display.setText(String.valueOf(ans));
            }
        }

    }

}
