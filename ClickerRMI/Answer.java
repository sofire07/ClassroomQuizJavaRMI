
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
public interface Answer extends Remote {
    String getUserName() throws RemoteException;
    String getAnswer() throws RemoteException;
    boolean getResult() throws RemoteException;
}
