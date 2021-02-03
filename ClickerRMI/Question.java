import java.rmi.*;

public interface Question extends Remote{
    String getQuestion()throws RemoteException;
    String[] getAnswers()throws RemoteException;
    String getType()throws RemoteException;
    String getCorrect() throws RemoteException;
}