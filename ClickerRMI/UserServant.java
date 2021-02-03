import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class UserServant extends UnicastRemoteObject implements User{
    String userName;
    String pass;
    String type;
    boolean online;
    
    // Constructor
    public UserServant(String un,String ps,String t, boolean o)throws RemoteException{
	userName = un;
        pass = ps;
        type = t;
        online = o;
    }
    
    // Return userName
    public String getUserName()throws RemoteException{
        return userName;
    }
    
    // Return pass
    public String getPass()throws RemoteException{
        return pass;
    }
    
    // Return type
    public String getType()throws RemoteException{
        return type;
    }
    
    public boolean getOnline() throws RemoteException{
        return online;
    }
    
    // Used to print out the username pass and type 
    
    public void showQuestion(Question q, String ans) throws RemoteException{
        
    }
    
    public void showAnswers(User u, String a) throws RemoteException{
        
    }
}
