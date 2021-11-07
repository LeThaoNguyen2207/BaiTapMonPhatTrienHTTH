import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientRMI {

	static Scanner sc;
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException{
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 6789);
            StringInterface obj = (StringInterface)reg.lookup("rmi");

            while (true) {

            	System.out.println("Chon 1. In hoa chu dau \n "
		        		+"Chon 2. Dao nguoc chuoi"
		        		+" \n exit de ket thuc\n");
                System.out.print("Chon:");
                sc = new Scanner(System.in);
                String choose = sc.nextLine();
                
                if(choose.equals("exit")){
                   break;
                }else if(choose.equals("1")){
                    System.out.print(" nhap 1 chuoi:");
                    sc = new Scanner(System.in);
                    String a = sc.nextLine();
                    System.out.println("in hoa chu dau:" + obj.upperCase(a)+"\n\n");
                    
                }else if(choose.equals("2")){
                    System.out.println(" nhap 1 chuoi:");
                    sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    System.out.println("in hoa chu dau:" + obj.reverse(str)+"\n\n");

                }
             }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
