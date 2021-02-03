import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class QuestionRemoteServant extends UnicastRemoteObject implements QuestionRemote{
    private Vector<QuestionServant> quest;
      
    public QuestionRemoteServant()throws RemoteException{
        quest = new Vector<QuestionServant>();
    }
    
    public Question newQuestion(String t, String q, String a1, String a2, String a3, String a4, String c) throws RemoteException{
        QuestionServant qs = new QuestionServant(t,q,a1,a2,a3,a4,c);
        quest.addElement(qs);
        return qs;
    }
    
    public Question updateQuestion(String t, String q, String a1, String a2, String a3, String a4, String c) throws RemoteException{
        QuestionServant qs = new QuestionServant(t,q,a1,a2,a3,a4,c);
        quest.set(0,qs);
        return qs;
    }
    
    public void clearQuestion() throws RemoteException{
        quest.clear();        
    }

   public Vector question()throws RemoteException{
        return quest;
    }
}
