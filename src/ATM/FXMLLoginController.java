/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author DONY SAMDHILA
 */
public class FXMLLoginController implements Initializable {
    String pin="";
    String PIN="1234";
    int chance=3;
    int tmp;
            
    @FXML
    private JFXButton q1;
    @FXML
    private JFXButton q4;
    @FXML
    private JFXButton q7;
    @FXML
    private JFXButton q2;
    @FXML
    private JFXButton q5;
    @FXML
    private JFXButton q8;
    @FXML
    private JFXButton q3;
    @FXML
    private JFXButton q6;
    @FXML
    private JFXButton q9;
    @FXML
    private JFXButton qc;
    @FXML
    private JFXButton q0;
    @FXML
    private JFXButton ok;
    @FXML
    private PasswordField editpin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void tk1(ActionEvent event) {
        pin+="1";
        editpin.setText(pin);
    }

    @FXML
    void tk4(ActionEvent event) {
        pin+="4";
        editpin.setText(pin);
    }

    @FXML
    void tk7(ActionEvent event) {
        pin+="7";
        editpin.setText(pin);
    }

    @FXML
    void tk2(ActionEvent event) {
        pin+="2";
        editpin.setText(pin);
    }

    @FXML
    void tk5(ActionEvent event) {
        pin+="5";
        editpin.setText(pin);
    }

    @FXML
    void tk8(ActionEvent event) {
        pin+="8";
        editpin.setText(pin);
    }

    @FXML
    void tk3(ActionEvent event) {
        pin+="3";
        editpin.setText(pin);
    }

    @FXML
    void tk6(ActionEvent event) {
        pin+="6";
        editpin.setText(pin);
    }

    @FXML
    void tk9(ActionEvent event) {
        pin+="9";
        editpin.setText(pin);
    }

    @FXML
    void tkc(ActionEvent event) {
        pin="";
        editpin.setText(pin);
    }

    @FXML
    void tk0(ActionEvent event) {
        pin+="0";
        editpin.setText(pin);
    }

    @FXML
        void tkok(ActionEvent event) {
        if (pin.equals(PIN)){
        try{
        ((Node) (event.getSource())).getScene().getWindow().hide();
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLTransfer.fxml"));
        Scene scene =new Scene(fxmlLoader.load(),830,450);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
        }catch (IOException e){
        System.out.println("Failed."+e);
        }
        }else{
        chance-=1;
        JOptionPane.showMessageDialog(null, "PIN anda salah \nTersisa"+chance+"Chance");
        editpin.setText("");
        pin="";
        if(chance == 0){
        System.exit(0);
        }
        }
    }
    }
    

