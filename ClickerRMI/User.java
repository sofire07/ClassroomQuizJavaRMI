
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRIS
 */
public interface User extends Remote {
    String getUserName()throws RemoteException;
    String getPass()throws RemoteException;
    String getType()throws RemoteException;
    boolean getOnline() throws RemoteException;
    void showQuestion(Question q, String ans) throws RemoteException;
    void showAnswers(User u, String a) throws RemoteException;
    
}
