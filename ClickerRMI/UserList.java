//package examples.RMIShape;
import java.rmi.*;
import java.util.Vector;

public interface UserList extends Remote {
    User newUser(String u, String p, String t, boolean o) throws RemoteException;  
    User updateUser(int i, String u, String p, String t, boolean o) throws RemoteException;
    Vector allUsers()throws RemoteException;
    int getVersion() throws RemoteException;
}
