
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
public class AnswerListServant extends UnicastRemoteObject implements AnswerList {
    
    private Vector<AnswerServant> answerList;
    
    public AnswerListServant()throws RemoteException{
        answerList = new Vector<AnswerServant>();
    }

    public Answer newAnswer(String u, String a, boolean r) throws RemoteException{
        AnswerServant as = new AnswerServant(u, a, r);
        answerList.addElement(as);                
        return as;
     }
    
    public void clearAnswers() throws RemoteException{
        answerList.clear();
    }
    
   public Vector allAnswers()throws RemoteException{
        return answerList;
    }
    
}
