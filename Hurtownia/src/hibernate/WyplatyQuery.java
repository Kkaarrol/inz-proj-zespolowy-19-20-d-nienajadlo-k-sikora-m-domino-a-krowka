/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author karol
 */
public class WyplatyQuery {
    
     Session session = null;
    Query query = null;
    Criteria criteria = null;
    
    public List<Wyplaty> WyplatySelectAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        criteria = session.createCriteria(Wyplaty.class);
        List<Wyplaty> w = criteria.list();
        session.close();
        return w;
    }
    
     public List<Wyplaty> wyplatyID(int id){
        session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Wyplaty where PracownikId = '" + id + "'";
        Query query = session.createQuery(hql);
        List <Wyplaty> wyplaty = query.list();
        session.close();
        int i = 0;
        for(Wyplaty w : wyplaty){
            if(w.getPracownik().getPracownikId() != id){
                wyplaty.remove(i);
            }
            i++;
        }
        return wyplaty;
     
}
}
