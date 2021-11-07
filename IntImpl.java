import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class IntImpl extends UnicastRemoteObject implements StringInterface {
    static Scanner sc;

    public String upperCase(String str) throws RemoteException {
        
        char[] in = str.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < in.length; i++) {

            if (Character.isLetter(in[i])) {
                if (foundSpace) {
                   in[i] = Character.toUpperCase(in[i]);
                   foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        return String.valueOf(in);
    }
    
    public boolean checkExit(String str) throws RemoteException {
        if(str.equals("exit")){
            return false;
        }else return true;
    }
    
    private static final long serialVersionUID = 1L;
    
    public IntImpl() throws RemoteException {
        super();
    }

    public String reverse(String str) throws RemoteException {
        StringBuilder a = new StringBuilder(str);
        return a.reverse().toString();
    }
