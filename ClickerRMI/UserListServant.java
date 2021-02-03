// Imports
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class UserListServant extends UnicastRemoteObject implements UserList{
    private Vector<UserServant> theList;
    private int version;
    
    public UserListServant()throws RemoteException{
        theList = new Vector<UserServant>();
    }

    public User newUser(String u, String p, String t, boolean o) throws RemoteException{
        UserServant us = new UserServant(u,p,t,o);
        theList.addElement(us);                
        return us;
     }
    
    public User updateUser(int i, String u, String p, String t, boolean o) throws RemoteException{
        UserServant us = new UserServant(u ,p,t,o);
        theList.set(i, us);
        return us;
    }

   public Vector allUsers()throws RemoteException{
        return theList;
    }

    public int getVersion() throws RemoteException{
        return version;
    } 
}
