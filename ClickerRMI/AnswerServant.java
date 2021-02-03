
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRIS
 */
public class AnswerServant extends UnicastRemoteObject implements Answer {
    String username;
    String answer;
    boolean result;
    
    public AnswerServant(String un, String a, boolean r) throws RemoteException{
        username = un;
        answer = a;
        result = r;
    }
    
    @Override
    public String getUserName() throws RemoteException {
        return username;
    }

    @Override
    public String getAnswer() throws RemoteException {
       return answer;
    }
    
    public boolean getResult() throws RemoteException{
        return result;
    }
    
}
