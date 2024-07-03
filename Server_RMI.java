/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokensRMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Korisnik
 */
public class Server_RMI {
    public static void main(String[] args) throws RemoteException{
    
        try{
            Registry reg = LocateRegistry.createRegistry(1098);
            Tokens_INterface_Impl ti = new Tokens_INterface_Impl();
            reg.rebind("num", ti);
        }catch (RemoteException e){
        System.out.println("Doslo je do greske prilikom pokretanja servera:" +e.getMessage());
        }
    }
    
}
