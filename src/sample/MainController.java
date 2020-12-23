package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.Random;

public class MainController extends Model
{
    @FXML TextField Question = new TextField();
    @FXML Text Answer = new Text();

    @FXML
    public void getRandomAnswer()
    {
        ArrayList<String> answers = new ArrayList<String>();
        answers.addAll(positiveAnswers);
        answers.addAll(negativeAnswers);

        Random random = new Random();
        int r = random.nextInt(20);

        if(Question.getText().contains("?"))
        {
            Answer.setText(answers.get(r));
        }
        else if(Question.getText().contains("Softwareentwicklung")) {
            Answer.setText(positiveAnswers.get(r));
        }
        else{
            System.err.println("Add a '?' to indicate, that you're asking a question!");
        }
    }
}