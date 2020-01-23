/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
public class AutoSalonRepository {
    
    private final Session session;
    
    public AutoSalonRepository(){
           session = HibernateUtil.getSessionFactory().openSession();
    }

    public List<Automobil> loadAutomobil() {        
        return session.createCriteria(Automobil.class).list();
    }

    public Automobil getById(Integer id) {
        return (Automobil) session.get(Automobil.class, id);
    }

    public void saveAutomobil(Automobil automobil) {
        try {
            session.beginTransaction();
            session.saveOrUpdate(automobil);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public void saveUser(User user) {
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
}
