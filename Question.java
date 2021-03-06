// interface Question{
//     void displayQuestion();
//     void displayAnswer();
// }
// I was originally going to create an interface and two classes that extend it, one for multipel choice and one for T/F.
// Until I realized the two classes were exactly the same. 
import java.util.ArrayList;
public class Question{
    private String question;
    private char ans;
    private ArrayList<String>  choices;

    public Question(String question, char ans, ArrayList<String> choices){
        this.question = question;
        this.ans = ans;
        this.choices = choices;
    }
    

    public String getQuestion() {
        return question;

    }
    
    public ArrayList<String> getChoices(){
        return choices;
    }

    public int getLenChoices(){
        return choices.size();
    }
    
    public char getAnswer() {
        return ans;
    }




}
