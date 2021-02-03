// Imports 
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class ClickerServer {
	public static void main(String args[]){
		System.setSecurityManager(new SecurityManager());
		
        System.out.println("Main OK");
        try{
            UserList userList = new UserListServant();
            System.out.println("User Created");
            Naming.rebind("UserList", userList);
            System.out.println("UserList server ready");
            
            
            QuestionRemote questionList = new QuestionRemoteServant();
            Naming.rebind("QuestionRemote", questionList);
            System.out.println("Question Storage Ready");
            
            AnswerList answerList = new AnswerListServant();
            Naming.rebind("AnswerList", answerList);
            System.out.println("Answer Storage Ready");
        }catch(Exception e) {
            System.out.println("UserList server main " + e.getMessage());
        }
    }
}
