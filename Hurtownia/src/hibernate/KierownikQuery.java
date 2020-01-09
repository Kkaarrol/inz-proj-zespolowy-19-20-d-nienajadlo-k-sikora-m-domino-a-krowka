/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author adamk
 */
public class KierownikQuery {
     
    Session session = null;
    Query query = null;
    Criteria criteria = null;
    
    public void dodajPracownika(String imie , String nazwisko, 
            float placa,String stanowisko){
    
        session = HibernateUtil.getSessionFactory().openSession();
    String query = "INSERT INTO `pracownik` (`Imie`, `Nazwisko`, `Placa`,"
            + " `PracownikID`, `Stanowisko`, `login`, `password`) "
            + "VALUES ('" + imie +"', '"+nazwisko+"', '"+placa+"',"
            + " NULL, '"+stanowisko+"', NULL, NULL)";
  try {
    session.getTransaction().begin();
    session.createSQLQuery(query).executeUpdate();
    session.getTransaction().commit();
    session.close();
}
catch (HibernateException error){
    session.getTransaction().rollback();
    session.close();
}
    
    }
    
     public void zwolnijPracownika (Integer pracownikId){
        session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = null;
         
         try{
             tx = session.beginTransaction();
             Pracownik pracownik;
            pracownik = (Pracownik)session.get(Pracownik.class, pracownikId);
             session.delete(pracownik);
             tx.commit();   
         }catch(Exception e){
             if(tx != null) tx.rollback();
             e.printStackTrace();
         } finally{
             session.close();
         }
    }
    
   
}
