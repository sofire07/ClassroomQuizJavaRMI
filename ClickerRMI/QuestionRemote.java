
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
public interface QuestionRemote extends Remote {
    Question newQuestion(String t, String q, String a1, String a2, String a3, String a4, String c)throws RemoteException;
    Question updateQuestion(String t, String q, String a1, String a2, String a3, String a4, String c)throws RemoteException;
    void clearQuestion() throws RemoteException;
    Vector question()throws RemoteException;   
}
