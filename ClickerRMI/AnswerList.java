
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRIS
 */
public interface AnswerList extends Remote{
    Answer newAnswer(String u, String a, boolean r) throws RemoteException;  
    void clearAnswers() throws RemoteException;
    Vector allAnswers()throws RemoteException; 
    
}
