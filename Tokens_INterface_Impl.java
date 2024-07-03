/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokensRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 *
 * @author Korisnik
 */
public class Tokens_INterface_Impl extends UnicastRemoteObject  implements Tokens_Interface_RMI{

    public Tokens_INterface_Impl() throws RemoteException {
        super();
    }
    public String Tokens(String txt)throws RemoteException{
        try {
        
     String rezultat = "";   
        
     rezultat=txt.trim();
     String regex = "[\\p{L}\\p{M}\\p{N}]+(?:\\p{P}[\\p{L}\\p{M}\\p{N}]+)*|[\\p{P}\\p{S}]";//ovaj regularni izraz će pronaći svaki niz znakova koji se sastoji od slova,
             // dijakritičkih znakova, brojeva i znakova interpunkcije.
            String[] tokens = Pattern.compile(regex).matcher(rezultat).results().map(MatchResult::group).toArray(String[]::new);
       
            // kreirajte novi string koji će sadržati token-e
            StringBuilder sb = new StringBuilder(); //StringBuilder je klasa u programskom jeziku Java koja predstavlja objekt koji se koristi za izgradnju i manipuliranje nizovima znakova.
            for (String token : tokens) {
                sb.append(token).append(", "); //odvajamo zarezom
            }return sb.toString();
    }
    catch(Exception e){
    //obrada izuzetka
    throw new Exception("Doslo je do greske prilikom obrade telsta:" + e.getMessage());
    }
}
   
}
