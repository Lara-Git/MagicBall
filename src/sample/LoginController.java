package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Model{

    @FXML TextField userInput = new TextField();
    @FXML PasswordField passwordInput = new PasswordField();
    @FXML Button btn_Login = new Button();

    private Stage stage;
    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    @FXML
    private void next()
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            if(btn_Login.isPressed() && isCorrectLogin(userInput.getText(), passwordInput.getText())){
                Stage mainStage = new Stage();
                mainStage.setTitle("Main");
                mainStage.setScene(new Scene(root, 600, 400));
                mainStage.show();

                this.stage.close();
            }
        }
        catch (Exception ex){
            System.out.println("Error!");
        }
    }
}