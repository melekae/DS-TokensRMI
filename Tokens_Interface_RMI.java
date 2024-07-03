/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TokensRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Korisnik
 */
public interface Tokens_Interface_RMI extends Remote {
    
    public String Tokens( String txt) throws RemoteException;
    
}
