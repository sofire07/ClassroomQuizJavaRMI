import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class QuestionServant extends UnicastRemoteObject implements Question{
    String question;
    String[] answers;
    String type;
    String correct;
    
    // Constructors 
    public QuestionServant(String t, String q, String a1, String a2, String a3, String a4, String c)throws RemoteException {
        type = t;
        question = q;
        answers = new String[]{a1,a2,a3,a4};
        correct = c;
    }
    
    // Return Question
    public String getQuestion()throws RemoteException{
        return question;
    }
    
    // Return answers
    public String[] getAnswers()throws RemoteException{
        return answers;
    }
    
    // Return type 
    public String getType()throws RemoteException{
        return type;
    }
    
    public String getCorrect() throws RemoteException{
        return correct;
    }
    
}