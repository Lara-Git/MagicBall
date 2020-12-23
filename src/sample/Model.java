package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Model
{
    public boolean isCorrectLogin(String name, String password)
    {
        //Username: Lara
        //Password: Asar

        if(name.equals("Lara") && password.equals("Asar")){
            return true;
        }

        else if(!name.equals("Lara") && password.equals("Asar"))
        {
            System.err.println("Wrong Username!");
        }

        else if(name.equals("Lara") && !password.equals("Asar"))
        {
            System.err.println("Wrong Password!");
        }

        else if(!name.equals("Lara") && !password.equals("Asar"))
        {
            System.err.println("Wrong Username and Password!");
        }
        return false;
    }

    //Positive and Negative answer examples from Wikipedia: Magic 8 Ball
    ArrayList<String> positiveAnswers = new ArrayList<String> (Arrays.asList("It is certain.", "It is decidedly so.", "Without a doubt.", "Yes – definitely.", "You may rely on it."));
    ArrayList<String> negativeAnswers = new ArrayList<String> (Arrays.asList("Don’t count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."));


}