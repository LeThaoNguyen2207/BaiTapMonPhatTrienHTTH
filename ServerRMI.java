import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ServerRMI {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            IntImpl obj = new IntImpl();

            LocateRegistry.createRegistry(6789);
            Registry reg = LocateRegistry.getRegistry(6789);
            System.out.println("Khoi tao doi tuong thanh cong...");

            reg.rebind("rmi", obj);
            System.out.println("da dang ki doi tuong thanh cong");
            

        } catch (Exception e) {
            // TODO: handle exception
        	e.printStackTrace();
        }
	}
}
